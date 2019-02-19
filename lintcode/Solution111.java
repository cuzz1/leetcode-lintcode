public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        if (n == 0) return 0;
        int a = 1;
        int b = 1;
        int x = 0;
        while (x++ < n) {
            int temp = a;
            a = b;
            b = b + temp;
        }
        return a;
    }
}
