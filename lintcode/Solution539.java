package src;

public class Solution539 {
    /**
     * @param nums: an integer array
     * @return: nothing
     */
    public void moveZeroes(int[] nums) {
    	
    	// nums 中， [0...p)的元素均为非0元素
        int p = 0;
        
        // 遍历非0的元素都在[0...p)中
        // [p...i]为0
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
            	exch(nums, i,p);
            	p++;
            }
        }
    }

	private void exch(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		temp = nums[i];
	}
}
