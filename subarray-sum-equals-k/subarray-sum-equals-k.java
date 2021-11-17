class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int sum = 0;
        int count = 0;
        int diff = 0;
        sumMap.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            diff = sum - k;
            if (sumMap.containsKey(diff)) {
                count += sumMap.get(diff);
            }
            sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}