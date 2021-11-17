class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
            if (queue.size() > k) { // just keep the 2 highest number
                queue.poll();
            }
        }
        return queue.poll(); // pop out the largest
    }
    
}
