class Solution {
    int maxLen;
    int indexOfMaxLen;
    public String longestPalindrome(String s) {
        // check edge cases
        if (s.length() < 2) return s;
        if (s == null || s.length() < 1) return "";
        
        maxLen = 0;
        // loop through the string
        for (int start = 0; start < s.length() - 1; start++) {
            // expand to both sides of the current charracter to find 
            // the posible longest substring
            expandPalindrome(s, start, start); // start when len is even
            expandPalindrome(s, start, start + 1); // len is odd
        }
        // return the start of max len found
        return s.substring(indexOfMaxLen, indexOfMaxLen + maxLen);
    }
    
    private void expandPalindrome(String s, int left, int right) {
        // loop as long as there are identical character using 2 pointers
        // assuming they start from the middle of substring
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // find max len here
        if (maxLen < right - left - 1) {
            maxLen = right - left - 1;
            indexOfMaxLen = left + 1;
        }
        
    }
}