package src;

public class Solution031 {
    /**
     * @param nums: The integer array you should partition
     * @param k: An integer
     * @return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
        // write your code here
        
        int left = 0;
        int right = nums.length-1;
        
        while(left < right) {
            while (left <= right && nums[left] < k) {
                left++;
            }
            
            while (left < right && nums[right] >= k) {
                right--;
            }
            
            if (left < right) {
                int temp = nums[left];
                nums[right] = nums[left];
                nums[left] = temp;
                left ++;
                right--;
            }
        }
        return left;
        
    }
}