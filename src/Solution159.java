package src;

public class Solution159 {
    /**
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[end] > nums[mid]) {
                // end = mid - 1  当只有两个元素时会报错
                end = mid;
            } else if (nums[end] < nums[mid]) {
                start = mid + 1;
            } else {
                end = end - 1;
            }
        }
        return nums[start];
    }
}