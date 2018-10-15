package src;

public class Solution384 {
    /**
     * @param s: a string
     * @return: an integer
     */
    public int lengthOfLongestSubstring(String s) {
        int[] f = new int[256];
        
        int left = 0;
        int right = -1;
        int res = 0;
        
        while (left < s.length()) {
            if (right < s.length() - 1 && f[s.charAt(right + 1)] == 0) {
                f[s.charAt(++right)] ++;
            } else {
                f[s.charAt(left++)]--;
            }
            
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}