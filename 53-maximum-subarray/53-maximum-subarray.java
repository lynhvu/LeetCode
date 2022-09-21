class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (cur < 0) {
                cur = 0;
                
            } 
            cur = cur + nums[i];
            if (cur > max) {
                max = cur;
            }
        }
        return max;
    }
}