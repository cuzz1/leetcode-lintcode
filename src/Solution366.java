package src;

public class Solution366 {
    /**
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        // write your code here
    	int a = 0;
    	int b = 1;
    	while(n > 1){
    		int temp = a + b;
    		a = b;
    		b = temp;
    		n --;
    	}
    	return a;
    }
}