class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];
            if (n < 0) { // swap min and max aka swap the sign
                int temp = max;
                max = min;
                min = temp;
            }
            
            min = Math.min(n, min * n);
            max = Math.max(n, max * n);
            ans = Math.max(max, ans);
        }
        return ans;
    }
}