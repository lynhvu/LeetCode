class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer, Integer> tracking = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (tracking.containsKey(nums[i])) {
                return true;
            } else {
                tracking.put(nums[i], 1);
            }
        } 
        return false;
    }
}