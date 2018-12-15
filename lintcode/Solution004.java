public class Solution {
    /**
     * @param n: An integer
     * @return: the nth prime number as description.
     */
    public int nthUglyNumber(int n) {
        if (n <= 6) return n;
        int[] dp = new int[n];
        dp[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < n; i++) {
            int next2 = dp[i2] * 2, next3 = dp[i3] * 3, next5 = dp[i5] * 5;
            int next = Math.min(next2, Math.min(next3, next5));
            dp[i] = next;
            if (next == next2) i2++;
            if (next == next3) i3++;
            if (next == next5) i5++;
        }
        return dp[n-1];
    }
}
