class Solution {
    public String sortSentence(String s) {
        // create string arr from string
        String[] newStr = s.split(" "); 
        // create res array 
        String[] res = new String[newStr.length];
        // loop through each sub string
        for (String cur : newStr) {
            // convert string num to int by minus to string 0
            int index = cur.charAt(cur.length() - 1) - '0';
            // remove the last character out of string
            String curStr = cur.substring(0, cur.length() - 1);
            // place string into its index
            res[index - 1] = curStr;
        }
        
        // create a stringbuilder to put the string together
        StringBuilder sb = new StringBuilder();
        for (String str : res) {
            sb.append(str + " ");
        }
        // remove the extra space at the end
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}