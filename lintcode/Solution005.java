public class Solution {
    /**
     * @param n: An integer
     * @param nums: An array
     * @return: the Kth largest element
     */
    public int kthLargestElement(int n, int[] nums) {
        if (nums == null || nums.length == 0 || nums.length + 1 < n) return -1;
        quickSort(nums, 0, nums.length - 1);
      
        return nums[nums.length - n];
    }
    
    private void quickSort(int[] nums, int start, int end) {
        if (start > end) return;
        int p = partition(nums, start, end);
        quickSort(nums, start, p - 1);
        quickSort(nums, p + 1, end);
    }
    
    private int partition(int[] nums, int start, int end) {
        int p = start;
        for (int i = start; i < end; i++) {
            if (nums[i] < nums[end]) {
                swap(nums, i, p++);
            }
        }
        swap(nums, p, end);
        return p;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
