class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        boolean isFind = false;
        while (start <= end) {
            mid = (end - start) / 2 + start;
            
            if (nums[mid] == target) {
                isFind = true;
                break;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(mid);
        
        if (isFind) {
            int i = mid;
            int j = mid;
            while (i > start && nums[i] == nums[i - 1]) {
                i--;
            }
            while (j < end && nums[j] == nums[j + 1]) {
                j++;
            }
            return new int[]{i, j};
        } else {
            return new int[]{-1, -1};
        }
    }
}
