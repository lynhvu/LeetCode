class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        Set<Character> store = new HashSet<>();
        int maxLen = 0;
        int leftPointer = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!store.contains(ch)) {
                store.add(ch);
            } else {
                if (maxLen < store.size()) {
                    maxLen = store.size();
                }
                while(s.charAt(leftPointer) != ch) {
                    store.remove(s.charAt(leftPointer));
                    leftPointer++;
                }
                leftPointer++;
            }
        }
        if (store.size() > maxLen) {
            maxLen = store.size();
        }
        return maxLen;
    }
}