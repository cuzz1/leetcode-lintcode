class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length <= 2) return nums.length;
        
        int count = 2;
        
        for (int i = 2; i < nums.length; i++) {
            // count是固定的，所以要用count
            if (nums[i] != nums[count-2]) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
