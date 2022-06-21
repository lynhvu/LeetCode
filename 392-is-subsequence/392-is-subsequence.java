class Solution {
    public boolean isSubsequence(String s, String t) {
        if (t.length() < s.length()) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        int charIndex = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(charIndex)) {
                if (charIndex == s.length() - 1) {
                    return true;
                } 
                charIndex++;
            }
        }
        return false;
    }
}