class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }
    
    private static List<List<Integer>> backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<Integer>(temp));     
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (!temp.contains(nums[i])) { // temp doesn't have this number yet
                    temp.add(nums[i]);
                    backtrack(res, temp, nums);
                    temp.remove(temp.size() - 1);
                }
            }
        }
        return res;
    }
}