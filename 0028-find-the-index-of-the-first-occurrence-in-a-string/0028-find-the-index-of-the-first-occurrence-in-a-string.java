class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            // check if the first charater match before checking anything else
            if (haystack.charAt(i) == needle.charAt(0)) {
                // make sure that haystack still in bound
                if (i + needle.length() <= haystack.length()) {
                    // cut the haystack to compare with needle
                    String cut = haystack.substring(i, i + needle.length());
                    if (cut.equals(needle)) return i;
                }
            }
        }
        return -1;
    }
}