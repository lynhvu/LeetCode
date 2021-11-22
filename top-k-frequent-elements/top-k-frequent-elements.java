class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for (int i = 0; i < nums.length; i++) {   
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Integer> topK = new PriorityQueue<>((n1, n2) 
                                        -> map.get(n1) - map.get(n2));
        for (int num : map.keySet()) {
            topK.add(num);
            if (topK.size() > k) {
                topK.poll();
            }
        }
        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = topK.poll();
        }
        return res;
    }
}