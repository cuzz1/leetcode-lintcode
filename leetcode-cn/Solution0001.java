class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        if (nums.length < 2) {
            return res;
        }

        // cache
        Map<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (cache.containsKey(key)) {
                return new int[]{cache.get(key), i};
            }
            cache.put(nums[i], i);
        }
        return res;
    }
}
