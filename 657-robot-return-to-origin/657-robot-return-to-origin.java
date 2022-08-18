class Solution {
    public boolean judgeCircle(String moves) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < moves.length(); i++) {
            map.put(moves.charAt(i), 
                    map.getOrDefault(moves.charAt(i), 0) + 1);
        }
        int left = 0; int right = 0;
        int up = 0; int down = 0;
        
        for (char cur : map.keySet()) {
            if (cur == 'L') left = map.get(cur);
            else if (cur == 'R') right = map.get(cur);
            else if (cur == 'U') up = map.get(cur);
            else if (cur == 'D') down = map.get(cur);
        }
        return (left - right == 0) && (up - down == 0);
    }
}