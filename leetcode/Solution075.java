class Solution {
    public void sortColors(int[] nums) {
        
        int left= -1;
        int right = nums.length;

        
        for (int i = 0; i < right;)  {
            int temp = nums[i];
            if (temp == 0) {
                swap(nums, i++, ++left);
            } else if (temp == 2) {
                swap(nums, i , --right);
            } else {
                i++;
            }
            
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
