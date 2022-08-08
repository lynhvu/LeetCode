class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sHash = new HashMap<>();
        HashMap<Character, Integer> tHash = new HashMap<>();
        // create hash map for both strings
        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            sHash.put(chS, sHash.getOrDefault(chS, 0) + 1);
            sHash.put(chT, sHash.getOrDefault(chT, 0) - 1);
        }
        
        
        // check the frequency left
        for (char c : sHash.keySet()) {
            if (sHash.get(c) != 0) {
                return false;
            }
        }
        return true;
        
    }
}