package src;

public class Solution041 {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
	public static void main(String[] args) {
		int[] nums = {1, 3, -1, -2, 6,-4, 4};
		int result = maxSubArray(nums);
		System.out.println(result);
	}
    public static int maxSubArray(int[] nums) {
        // write your code here
        int temp = nums[0];
        for(int i = 0; i < nums.length; i++){
        	int addedNums = 0;
        	for(int j = i; j < nums.length; j++){
        		addedNums += nums[j];
        		temp = Math.max(temp, addedNums);
        	}
        }
        return temp;
    }
}