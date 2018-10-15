package src;

public class Solution111 {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // if (n == 1) {
        //     return 1;
        // }
        // if (n == 2) {
        //     return 2;
        // }
        // return climbStairs(n - 1) + climbStairs(n - 2);
        if (n == 0) {
            return 0;
        }
        
        int a = 1;
        int b = 2;
        int i = 1;
        while (i++ < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        
        return a;
    }
}