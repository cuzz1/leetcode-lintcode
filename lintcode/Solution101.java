package src;

public class Solution101 {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
        	return 0;
        }
        
        // 使用两个指针  
        int index = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
        	if (nums[i] == nums[index]) {
        		if (count < 2) {
        			nums[++index] = nums[i];
        			count++;
        		}
        	}else {
        		nums[++index] = nums[i];
        		count = 1;
        	}
        }
        return index + 1;
    }
}