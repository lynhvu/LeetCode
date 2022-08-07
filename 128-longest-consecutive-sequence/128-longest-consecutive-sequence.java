class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxStreak = 0;
        int curStreak = 0;
        int curNum = 0;
        for (int i : set) {
            if (!set.contains(i - 1)) {
                curStreak = 1;
                curNum = i;
                while (set.contains(curNum + 1)) {
                    curStreak++;
                    curNum += 1;
                }
                maxStreak = Math.max(maxStreak, curStreak);
            }
        }
        return maxStreak;
    }
}