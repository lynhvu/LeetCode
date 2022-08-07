class Solution {
    public int getMaxLen(int[] nums) {
        int maxLen = 0;
        int mainLen = 0;
        int tempLen = 0; // keep track of len when we meet a neg num
        for (int i : nums) {
            if (i == 0) {
                mainLen = 0;
                tempLen = 0;
            }
            else if (i > 0) {
                mainLen++;
                tempLen = tempLen == 0 ? 0 : tempLen + 1;
            }
            else {
                // swap
                int temp = mainLen;
                mainLen = tempLen == 0 ? 0 : tempLen + 1;
                tempLen = temp + 1;
            }
            maxLen = Math.max(maxLen, mainLen);
        }
        return maxLen;
    }
}