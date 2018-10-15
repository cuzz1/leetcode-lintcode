package src;

public class Solution413 {
    /**
     * @param n: the integer to be reversed
     * @return: the reversed integer
     */
    public int reverseInteger(int n) {
        // write your code here
    	int reversed_n = 0;
    	
    	while (n != 0) {
    		int temp = reversed_n * 10 + n % 10;
    		n = n / 10;
    		if (temp / 10 != reversed_n) {
    			reversed_n = 0;
    			break;
    		}
    		reversed_n = temp;
    	}
    	return reversed_n;
    }
}