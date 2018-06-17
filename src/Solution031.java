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
/**
 
public class Solution {
   
    public int partitionArray(int[] nums, int k) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int p = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k) {
                exch(nums, p, i);
                p ++;
            }
        }
        
        return p;
    }
    
    private void exch(int[] nums, int i, int j) {
        int temp  = nums[i];
        nums[j] = nums[i];
        nums[i] = temp;
    }
} 
 
 
*/