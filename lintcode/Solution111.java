public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        if (n < 1) return 0;
        int a = 1;
        int b = 1;
        
        for (int i = 0; i < n; i++) {
            int tmp = a;    
            a = b;
            b = b + tmp;
        }
        return a;
    }
}
