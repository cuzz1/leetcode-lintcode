public class Solution {
    /**
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                start++;
                continue;
            }
            
            if (nums[mid] > nums[end]) {
                start = mid;   
            } else {
                end = mid;
            }
        }
        
        return nums[start] < nums[end] ? nums[start] : nums[end];
    }
}
