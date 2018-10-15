package src;

public class Solution014 {
	/**
	 * @param nums: The integer array.
	 * @param target: Target to find.
	 * @return: The first position of target. Position starts from 0.
	 */
	public int binarySearch(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		// 范围在 [start, end] 这个闭区间里
		// 所以start == end [start, end] 仍然有效
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				
				while (mid > 0 && nums[mid] == nums[mid - 1]) {
					mid --;
				}
				return mid;
			}
			
			if (nums[mid] > target) {
				end = mid - 1;
			}
			
			if (nums[mid] < target) {
				start = mid + 1;
			}
		}
		return -1;
	}
}
 