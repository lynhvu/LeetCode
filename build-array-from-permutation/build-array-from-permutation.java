class Solution {
    public int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[temp[i]];
        }
        return res;
    }
}