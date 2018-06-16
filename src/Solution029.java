package src;

public class Solution029 {
    /**
     * @param s1: A string
     * @param s2: A string
     * @param s3: A string
     * @return: Determine whether s3 is formed by interleaving of s1 and s2
     */
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        dp[0][0] = true;
        
        // 考虑第一列
        for (int i = 1; i <= s1.length(); i++) {
            if (s1.charAt(i - 1) == s3.charAt(i - 1) && dp[i-1][0]) {
                dp[i][0] = true;
            }
        }
        
        // 考虑第一行
        for (int j = 1; j <= s2.length(); j++) {
            if (s2.charAt(j - 1) == s3.charAt(j - 1) && dp[0][j-1]) {
                dp[0][j] = true;
            }
        }
        
        // dp[i][j] 表示s3的第 i + j个字符
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if ((s3.charAt(i + j - 1) == s1.charAt(i - 1) && dp[i-1][j])
                || (s3.charAt(i + j -1) == s2.charAt(j - 1) && dp[i][j-1])) {
                    dp[i][j] = true;
                }
            }
        }
        
        return dp[s1.length()][s2.length()];
    }}