public class Solution {
    /*
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        if (nums == null || nums.length == 0) return;
        
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            // 是奇数
            if (nums[i] % 2 != 0) {
                swap(nums, i, p++);
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
