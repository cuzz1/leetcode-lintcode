package src;

public class Solution080 {
    /**
     * @param nums: A list of integers
     * @return: An integer denotes the middle number of the array
     */
	public static void main(String[] args) {
		int[] nums = {4,5,1,2,3,3};
		int result = median(nums);
		System.out.println(result);
	}
    public static int median(int[] nums) {
    	if (nums.length == 1){
    		return nums[0];
    	}
    	return sub(nums, 0, nums.length-1, (nums.length-1)/2);
    }
    
    private static int sub(int[] nums, int start, int end, int size) {
    	int p = partition(nums, start, end);
    	if (p == size) {
    		return nums[p];
    	}else if (p > size){
    		return sub(nums, start, p - 1, size);
    	}else{
    		return sub(nums, p + 1, end, size);
    	}
    }

	private static int partition(int[] nums, int start, int end) {
    	int pivot = nums[end];
    	int j = start;
    	for (int i = start; i < end; i++) {
    		if (nums[i] < pivot) {
    			exch(nums, i, j);
    			j++;
    		}
    	}
    	exch(nums, j, end);
    	return j-1;
	}

	private static void exch(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;	
	}
}