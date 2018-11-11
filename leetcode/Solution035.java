class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        
        int start = 0;
        int end = nums.length - 1;
        if (target > nums[end]) {
            return end + 1;
        }
        if (target < nums[start]) {
            return start;
        }
        
        while (start + 1 < end) {
        System.out.println(start + "  "  + end);
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        System.out.println(start + "  "  + end);
        
        if (nums[end] == target) {
            return end;
        } else if (nums[start] == target){
            return start;
        } else {
            return start + 1;
        }
    }
}
