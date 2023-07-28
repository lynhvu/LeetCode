class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // get num - fregand put it in hashmap
        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            map.put(cur, map.getOrDefault(cur, 0) + 1);
        } 
        // array of frequences
        ArrayList<Integer> freq = new ArrayList<>(map.values());
        Collections.sort(freq);
        // freq length also is the number of unique number
        int count = freq.size();
        // loop through freq
        for (Integer num : freq) {
            if (num <= k) { // when k can minus freq
                count--; // decrease the number of unique number
                k -= num; // update k
            } else {
                break;
            }
        }
        return count;
        
    }
}