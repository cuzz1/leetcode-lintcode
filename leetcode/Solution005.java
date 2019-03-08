class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return s;
        boolean[][] dp = new boolean[s.length()][s.length()];
        int max = 0;
        String res = "";
        // a b b a
        // i     j
        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i <= j; i++) {
                dp[i][j] =  s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1]);
                if (dp[i][j] && j - i + 1 > max) {
                    max = j - i + 1;
                    res = s.substring(i, j + 1); 
                }
            }
        }
        return res;
    }
}
