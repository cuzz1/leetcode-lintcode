package src;

public class Solution373 {
    /*
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // write your code here
    	int odd = 0;
    	int even = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		// 防止负数
    		if (nums[i] % 2 != 0) {
    			exch(nums, i, odd);
    			odd ++;
    			even ++;
    			
    		}
    		else {
    			exch(nums, i, even);
    			even++;
    		}
    	}
    }

	private void exch(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}