class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int left = 1;
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) { //loop from the right side
            res[i] = right; // concat array from right side
            right *= nums[i]; // updating right pointer value                                        
        }
        
        for (int j = 0; j < nums.length; j++) {
            res[j] *= left;
            left *= nums[j];
        }
        return res;
    }
}