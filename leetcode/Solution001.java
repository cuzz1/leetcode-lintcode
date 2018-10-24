class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[][] arr = new int[nums.length][2];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = i;
            arr[i][1] = nums[i];
        }
        
        Arrays.sort(arr, Comparator.comparingInt(o -> o[1]));
        
        
        int left = 0;
        int right = arr.length - 1;
        
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[left][1] + arr[right][1];
            if (sum == target) {
                return new int[]{arr[left][0], arr[right][0]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
