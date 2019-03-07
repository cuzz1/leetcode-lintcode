public class Solution {
    /**
     * @param n: An integer
     * @param nums: An array
     * @return: the Kth largest element
     */
    public int kthLargestElement(int n, int[] nums) {
        if (nums == null || nums.length == 0) return Integer.MIN_VALUE;
        quickSort(nums, 0, nums.length - 1);
        return nums[n - 1];
    }
    
    private void quickSort(int[] nums, int start, int end) {
        if (start > end) {
            return;
        }
        int mid = partition(nums, start, end);
        quickSort(nums, start, mid - 1);
        quickSort(nums, mid + 1, end);
    }
    
    private int partition(int[] nums, int start, int end) {
        int p = nums[end];
        int mid = start;
        for (int i = start; i < end; i++) {
            if (nums[i] > p) {
                swap(nums, mid, i);
                mid++;
            }
        }
        swap(nums, mid, end);
        return mid;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
