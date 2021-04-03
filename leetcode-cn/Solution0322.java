class Solution {

    public int coinChange(int[] coins, int amount) {

        // 从大到小排序
        coins = Arrays.stream(coins)
            .boxed()
            .sorted((a, b) -> b - a)
            .mapToInt(i -> i)
            .toArray();

        int[] memo = new int[amount + 1];
        Arrays.fill(memo, -1);
        memo[0] = 0;
        return getMinCoinCount(amount, coins, memo);
    }


  
    private int getMinCoinCount(int amount, int[] coins, int[] memo) {

        for (int currentAmount = 1; currentAmount <= amount; currentAmount++) {
            int minCount = Integer.MAX_VALUE;
            for (int c = 0; c < coins.length; c++) {
                int currentCoin = coins[c];
                // 当前硬币比总额还大，直接过滤
                if (currentCoin > currentAmount) {
                    continue;
                }
                int leftAmount = currentAmount - currentCoin;

                int leftCount = memo[leftAmount];
                // 说明这个组合不可信
                if (leftCount == -1) {
                    continue;
                }

                if (leftCount + 1 < minCount) {
                    minCount = leftCount + 1;
                }
            }
            if (minCount != Integer.MAX_VALUE) {
                memo[currentAmount] = minCount;
            }
        }
        return memo[amount];
    }
}
