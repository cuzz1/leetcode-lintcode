class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int[] dp = new int[nums.length];    
        dp[0] = nums[0];
        int sum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] + (dp[i-1] < 0 ? 0 : dp[i-1]);  
            sum = Math.max(sum, dp[i]);
        }
        return sum;
    }
}
