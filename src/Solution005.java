package src;

class Solution005 {
    /*
     * @param k : description of k
     * @param nums : array of nums
     * @return: description of return
     */
    public int kthLargestElement(int k, int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        k = nums.length - k + 1 - 1;
        int p = find(k, nums, start, end);
        
        return p;
    }
    
    private int find(int k, int[] nums, int start, int end) {
        if (start > end) {
            return Integer.MIN_VALUE;
        }
        
        int p = partition(k, nums, start, end);
        
        if (p == k) {
            return nums[k];
        } else if (p < k) {
            return find(k, nums, p + 1, end);
        } else {
            return find(k, nums, start, p - 1);
        }
        
        
    }
    
    private int partition(int k, int[] nums, int start, int end) {
        int flag = nums[end];
        int p = 0;
        for (int i = 0; i < end; i++) {
            if (nums[i] < flag) {
                exch(nums, i, p);
                p++;
            }
        }
        exch(nums, p, end);
        print(nums);
        return p;
    }
    
    
    private void exch(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void print(int[] nums) {
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
    
    
    
    
};