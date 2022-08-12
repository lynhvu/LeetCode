class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<>();
        
        Arrays.sort(products); // sort the array first
        // using 2 pointers to narrow down the array as possible
        int left = 0;
        int right = products.length - 1;
        
        
        // loop through each character of the search word
        for (int i = 0; i < searchWord.length(); i++) {
            ArrayList<String> temp = new ArrayList<>();
            char ch = searchWord.charAt(i);
            // loop through the first character of the first word in array, also make sure the length of the current word has to less or equal to current index because we don't want to look for the word that is longer than search word
            while (left <= right && (products[left].length() == i || products[left].charAt(i) < ch)) left++;
            while (left <= right && (products[right].length() == i || products[right].charAt(i) > ch)) right--;
            
            // since we only need the top 3 of the word array, we have to check the remain size after defining left and right pointers
            int remainSize = right - left + 1;
            // get the top three, since sometime the remain size is 2 and that would be what we return
            int topThree = Math.min(3, remainSize);
            // loop through the array and get the words added to a temp array
            for (int j = 0; j < topThree; j++) {
                // MAKE SURE to start from leftg pointer!!!!
                temp.add(products[left + j]);
            }         
            res.add(temp);
            
        }
        return res;
    }
}