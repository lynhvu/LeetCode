class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length < 1) {
            return -1;
        }
        int rsum = 0;
        int lsum = 0;
        for (int i = 0; i < nums.length; i++) { // find the whole sum
            rsum += nums[i];
        }
        for (int j = 0; j < nums.length; j++) {
            rsum -= nums[j];
            if (rsum == lsum) {
                return j;
            }
            lsum += nums[j];
        }
        
        return -1;
    }
}