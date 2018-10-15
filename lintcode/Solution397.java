package src;

import java.util.Arrays;

public class Solution397 {
    /**
     * @param A: An array of Integer
     * @return: an integer
     */
	public static void main(String[] args) {
		int[] A = {3, 5, 4, 2, 1};
		int res = longestIncreasingContinuousSubsequence(A);
		System.out.println(res);
	}
    public static int longestIncreasingContinuousSubsequence(int[] A) {
    	if (A == null || A.length == 0) {
    		return 0;
    	}
    	
    	int[] dp = new int[A.length];
    	int[] dp2 = new int[A.length];
    	
    	Arrays.fill(dp, 1);
    	Arrays.fill(dp2, 1);
    	
    	int max = 1;
    	int max2 = 1;
    	for (int i = 1; i < A.length; i++) {
    		if (A[i] > A[i-1]) {
    			dp[i] = dp[i-1] + 1;
    		}
    		if (A[i] < A[i-1]) {
    			dp2[i] = dp2[i-1] + 1;
    		}
    		max = Math.max(max, dp[i]);
    		max2 = Math.max(max2, dp2[i]);
    	}
    	return Math.max(max, max2);
    }
}