class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        helper(res, new ArrayList<>(), nums, new boolean[nums.length]); 
        return res;
    }
    
    private void helper(List<List<Integer>> res, List<Integer> list, int[] nums, boolean[] used) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            // 如果使用过就跳过
            if (used[i]) continue;
            // 去重
            if (i > 0 && nums[i] == nums[i-1] && used[i-1]) continue;
            used[i] = true;
            list.add(nums[i]);
            helper(res, list, nums, used);
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}
