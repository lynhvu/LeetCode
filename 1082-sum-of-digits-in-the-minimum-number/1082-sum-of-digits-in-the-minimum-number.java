class Solution {
    public int sumOfDigits(int[] nums) {
        int min;
        min = nums[0];

        // find minimum
        for (int i=0; i<nums.length; i++) {
            if(nums[i] < min)
               min = nums[i];
        }

        int sum = 0;
        while (min > 0) {
            int rem = min % 10;
            sum = sum + rem;
            min /= 10;
        }
        
        return sum % 2 == 0 ? 1 : 0;
    }
}