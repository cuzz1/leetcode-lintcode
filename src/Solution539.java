package src;

public class Solution539 {
    /**
     * @param nums: an integer array
     * @return: nothing
     */
    public void moveZeroes(int[] nums) {
        int i = 0;
        int count = 0;
        while(i < nums.length - count) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                count ++;
                nums[nums.length - 1] = 0;
            } else {
                i++;
            }
        }
    }
}