class Solution {
    public boolean isPalindrome(String s) {
        // convert letters to lower case
        String lower = s.toLowerCase();
        String str = "";
        // loop through the given string to take out English alphanumerics
        for (int i = 0; i < lower.length(); i++) {
            char letter = lower.charAt(i);
            if ('a' <= letter && letter <= 'z' || 
                '0' <= letter && letter <= '9') {
                str += letter;
            }
        }
        
        int start = 0;
        int end = str.length() - 1;
        // comparing the letters from both sides of string
        while (end > start) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}