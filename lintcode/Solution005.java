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
       
        // 转换为第m的小的元素, 从0开始
        int m = nums.length - k;
        
        int res = find(m, nums, start, end);
        return res;
    }
    
    private int find(int m, int[] nums, int start, int end) {
        if (start > end) {
            return Integer.MIN_VALUE;
        }
        
        int p = partition(nums, start, end);
        print(nums);
        if (p == m) {
            return nums[p];
        } else if (p > m) {
            return  find(m,nums, start, p - 1);
        } else {
           return find(m,nums, p + 1, end);
        }
    }
    
    private int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int p = start - 1; // [start, p]表示小于pivot [p, i] 大于pivot
        
        for (int i = start; i < end; i++) {
            if (nums[i] < pivot) {
                exch(nums, i, ++p);
            }
        }
        exch(nums, ++p, end);
        return p;
    }
    
    private void exch(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
    
};