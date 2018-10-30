class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        int [] res = new int[3];
        int abs = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length -2; i++) {
            int low = i + 1; 
            int high = nums.length - 1;
            int twoSum = target - nums[i];
            
            while (low < high) {
                
                int tar = Math.abs(nums[i] + nums[low] + nums[high] - target);
                if (tar < abs) {
                    abs = tar;
                    res[0] = nums[i];
                    res[1] = nums[low];
                    res[2] = nums[high];
                }
             
                if (twoSum == nums[low] + nums[high] ) {
                    return target;
                } 
                
                if (twoSum < nums[low] + nums[high]) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return res[0] + res[1] + res[2];
    }
}

// fast
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length -2; i++) {
            int low = i + 1; 
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == target) {
                    return target;
                } else if (sum < target) {
                    low++;
                } else {
                    high--;
                }
                
                if (Math.abs(sum - target) < Math.abs(res - target)) {
                    res = sum;
                }
            }
        }
        return res;
    }
}
