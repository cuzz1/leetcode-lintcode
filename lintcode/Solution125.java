public class Solution {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @param V: Given n items with value V[i]
     * @return: The maximum value
     */
    public int backPackII(int m, int[] A, int[] V) {
        
        // dp[i][j] = max(dp[i-1][j-A[i-1]] + V[i-1], dp[i-1][j])
        
        
        int[][] dp = new int[A.length + 1][m + 1];
        
        for (int i = 1; i <= A.length; i++) {
            for (int j = 1; j <= m; j++) {
                // 放不下
                if (A[i-1] > j) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j-A[i-1]] + V[i-1], dp[i-1][j]);
                }
            }
        }
        
        // for (int i = 0; i <= A.length; i++) {
        //     for (int j = 0; j <= m; j++) {
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        return dp[A.length][m];
    }
}
