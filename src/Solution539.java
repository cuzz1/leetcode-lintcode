package src;

public class Solution539 {
    /**
     * @param nums: an integer array
     * @return: nothing
     */
    public void moveZeroes(int[] nums) {
        int p = 0;
        
        // 把非0元素从p位置开始放
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[p] = nums[i];
                p++;
            }
        }
        // 最后的补0
        for (int j = p; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
