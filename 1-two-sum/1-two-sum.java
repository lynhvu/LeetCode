class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> tracking = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (tracking.isEmpty()) {
                tracking.put(target - nums[i], i);
            } else {
                if (tracking.containsKey(nums[i])) {
                    res[0] = tracking.get(nums[i]);
                    res[1] = i;
                    break;
                } else {
                    tracking.put(target - nums[i], i);
                }
            }
        }
        return res;
    }
}