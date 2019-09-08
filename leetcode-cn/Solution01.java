class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        if (nums.length < 2) {
            return new int[] {0, 0};
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if (map.containsKey(val)) {
                return new int[] {map.get(val), i};
            } 
            map.put(nums[i], i);
        }
       return new int[]{0, 0}; 
    }
}
