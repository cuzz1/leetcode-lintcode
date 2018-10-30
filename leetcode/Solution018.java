class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 4) {
            return res;
        }
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length -3; i++) {
            // 去重
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length -2; j++) {
                // 去重
                if (j > i + 1 && nums[j] == nums[j-1]) {
                    continue;
                }
                int low = j + 1; 
                int high = nums.length - 1;
                int twoSum = target - nums[i] - nums[j];
                while (low < high) {
                    if (twoSum == nums[low] + nums[high]) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        low++;
                        high--;
                        // 去重
                        while(low < high && nums[low] == nums[low-1]) low++;
                        while(low < high && nums[high] == nums[high+1]) high--;
                            
                    } else if (twoSum > nums[low] + nums[high]) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
            
        }
        return res;
    }
}
