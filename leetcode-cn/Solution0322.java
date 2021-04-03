class Solution {

    public int coinChange(int[] coins, int amount) {
        return getMinCoinCount(amount, coins);
    }

  
    // dp[v] = Math.min(dp[v], dp[v-coin] + 1)
    private int getMinCoinCount(int amount, int[] coins) {
        int MAX = Integer.MAX_VALUE / 2;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, MAX);
        dp[0] = 0;
        for (int v = 1; v <= amount; v++) {

            for (int coin : coins) {
                if (coin > v) {
                    continue;
                }
                dp[v] = Math.min(dp[v], dp[v-coin] + 1);
            }

        }

        return dp[amount] == MAX ? -1 : dp[amount];
    }
}
