class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        } if (nums.length == 1) {
            return nums[0];
        } 
        
        // want to keep track of start and end points 
        // a res var to keep track of smallest val
        int res = nums[0];
        int start = 0; int end = nums.length - 1;
        while (start <= end) {
            
            if (nums[end] > nums[start]) { // this mean the arr already sorted, return the min at the beginning 
                res = Math.min(res, nums[start]);
                return res;
            }
            int mid = (start + end) / 2;
            res = Math.min(res, nums[mid]);
            if (nums[mid] >= nums[start]) { 
                // mid is a part of right arr, we move to the right
                start = mid + 1;
            } else {
                // mid is a part of left arr, cut that part and check the right
                end = mid - 1;
            }
        }
        
        return res;
    }
}