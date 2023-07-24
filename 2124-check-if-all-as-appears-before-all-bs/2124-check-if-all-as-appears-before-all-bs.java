class Solution {
    public boolean checkString(String s) {
        boolean metB = false;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == 'a') {
                if (metB) return false;
            } else if (cur == 'b') {
                metB = true;
            }
        }
        return true;
    }
}