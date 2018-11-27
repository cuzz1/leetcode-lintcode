class Solution {
    public void sortColors(int[] nums) {
        int low = -1;
        int high = nums.length;
        
        for (int i = 0; i < high; ) {
            if (nums[i] == 0) {
                swap(nums, i++, ++low);
            } else if (nums[i] == 2) {
                swap(nums, i, --high);
            } else {
                i++;
            }
            // print(nums);
        }
        
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
