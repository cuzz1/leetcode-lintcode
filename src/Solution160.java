package src;

public class Solution160 {
    /**
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int res = findMin(nums, start, end);
        return res;
    }
    
    private int findMin(int[] nums, int start, int end) {
        if (start >= end) {
            return nums[start];
        }
        int mid = start + (end - start) / 2;
        // 如果中间的比最后的大那么目标会在 [mid + 1, end]
        if (nums[mid] > nums[end]) {
            return findMin(nums, mid + 1, end);
        // 如果中间的比最前面的小那么目标会在 [start, end]
        } else if (nums[mid] < nums[start]) {
            return findMin(nums, start, mid);
        // 如果都不是的话让end - 1
        } else {
            return findMin(nums, start, end - 1);
        }
    }
}