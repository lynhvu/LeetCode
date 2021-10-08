class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> res = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!res.containsKey(nums[i])) {
                res.put(nums[i], 1);
            } else {
                res.put(nums[i], res.get(nums[i]) + 1);
            }
        }
        Map.Entry<Integer, Integer> temp = null;
        for (Map.Entry<Integer, Integer> entry : res.entrySet()) {
            if (temp == null || entry.getValue() > temp.getValue()) {
                temp = entry;
            }
        }
        return temp.getKey();
    }
}