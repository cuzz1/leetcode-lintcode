class Solution {

    // 递归版本
    // public int climbStairs(int n) {
    //     if (n <= 2) {
    //         return n;
    //     }
    //     return climbStairs(n-1) + climbStairs(n-2);
    // }

    // 记忆搜索递归版本
    // public int climbStairs(int n) {
    //     // 记忆
    //     int[] memo = new int[n+1];
    //     return climbStairs(n, memo);
    // }

    // private int climbStairs(int n, int[] memo) {
    //     if (n == 0) {
    //         return 1;
    //     }
    //     if (n == 1) {
    //         return 1;
    //     }

    //     if (memo[n] != 0) {
    //         return memo[n];
    //     }
    //     int s = climbStairs(n-1, memo) + climbStairs(n-2, memo);
    //     memo[n] = s;
    //     return s;
    // }

    // 动态规划版本
    // public int climbStairs(int n) {
    //     if (n <= 2) return n;
    //     int[] dp = new int[n + 1];
    //     dp[1] = 1;
    //     dp[2] = 2;
    //     for (int i = 3; i < dp.length; i++) {
    //         dp[i] = dp[i-1] + dp[i-2];
    //     }
    //     return dp[n];
    // }

    // 循环版本
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int a = 1;
        int b = 2;

        for (int i = 3; i <= n; i++) {
            int tmp = a;
            a = b;
            b = tmp + b;
        }
        return b;
    }
}
