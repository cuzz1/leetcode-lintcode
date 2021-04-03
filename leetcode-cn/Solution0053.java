class Solution {
    public int maxSubArray(int[] nums) {

        int[] dp = new int[nums.length];

        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = nums[0];
        int res = dp[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
