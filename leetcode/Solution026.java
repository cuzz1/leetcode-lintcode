class Solution {
    public int removeDuplicates(int[] nums) {
        
        if (nums == null || nums.length == 0) return 0;
        
        int count = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[count++] = nums[i];
            }
            
        }
        return count;

    }
}
