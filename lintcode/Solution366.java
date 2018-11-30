public class Solution {
    /**
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        
        int a = 0;
        int b = 1;
        for (int i = 1; i < n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return a;
    }
}
