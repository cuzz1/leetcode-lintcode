public class Solution {
    /**
     * @param n: an integer
     * @return: an ineger f(n)
     */
    // public int fibonacci(int n) {
    //     if (n == 1) return 0; 
    //     if (n == 2) return 1;
    //     return fibonacci(n-1) + fibonacci(n-2);
    // }
    
    /**
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        
        int i = 1;
        int a = 0;
        int b = 1;
        while (i < n) {
            int temp = a;
            a =  b;
            b = temp + b;
            i++;
        }
        return a;
    }
}
