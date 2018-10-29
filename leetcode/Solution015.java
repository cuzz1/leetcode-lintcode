class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>(); 
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // 去重
            if (i > 0 && nums[i] == nums[i-1]) continue;
            
            int low = i+1;
            int high = nums.length-1;
            int twoSum = 0 - nums[i];
            
            while (low < high) {
                if (twoSum == nums[low] + nums[high]) {
                    System.out.println(i + " " + low + " " + high);
                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));  
                    while(low < high && nums[low] == nums[low+1]) low++;
                    while(low < high && nums[high] == nums[high-1]) high--;
                    low++;
                    high--;
                } else if (twoSum < nums[low] + nums[high]) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return res;
    }
}
