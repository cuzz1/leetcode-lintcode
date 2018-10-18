class Solution {
    public int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1);
        
        return nums[nums.length - k];
    }
    
    private void quickSort(int[] nums, int left, int right) {
        if (left > right) {
            return;
        }
        int d = partition(nums, left, right);
        quickSort(nums, left, d - 1);
        quickSort(nums, d + 1, right);
    }
    
    private int partition(int[] nums, int left, int right) {
        int value = nums[right];
        int p = left;
        for (int i = left; i < right; i++) {
            if (nums[i] < value) {
                swap(nums, i, p);
                p++;
            } 
        }
        swap(nums, p, right);
        return p;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}
