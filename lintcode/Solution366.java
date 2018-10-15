package src;

public class Solution366 {
    /**
     * @param n: an integer
     * @return: an ineger f(n)
     */
    // public int fibonacci(int n) {
    //     if (n == 1) {
    //         return 0;
    //     }
    //     if (n == 2)  {
    //         return 1;
    //     }
        
    //     return fibonacci(n - 1) + fibonacci(n - 2);
    // }
    
    public int fibonacci(int n) {
        int res = 0;
        int i = 0;
        int j = 1;
        while (n > 1) {
            int temp = i;
            i = j;
            j = temp + j;
            n --;
        }
        return i;
    }
    
}