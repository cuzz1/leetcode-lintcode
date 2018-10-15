package src;

public class Solution100 {
    /*
     * @param nums: An ineger array
     * @return: An integer
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
        	return 0;
        }
        // 使用两个指针一个遍历一个保持没有重复的数
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
        	if (nums[i] != nums[i-1]) {
        		nums[index++] = nums[i];
        	}
        }
        return index;
    	
    }
}