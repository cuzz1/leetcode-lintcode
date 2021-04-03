class Solution {

    // 记忆搜索版本
    public int climbStairs(int n) {
        // 记忆
        int[] memo = new int[n+1];
        return climbStairs(n, memo);
    }

    private int climbStairs(int n, int[] memo) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }

        if (memo[n] != 0) {
            return memo[n];
        }
        int s = climbStairs(n-1, memo) + climbStairs(n-2, memo);
        memo[n] = s;
        return s;
    }
}
