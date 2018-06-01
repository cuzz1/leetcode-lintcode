package src;

public class Solution001 {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b
     */
    public int aplusb(int a, int b) {
    	while (b != 0) {
    		int _a = a ^ b;
    		int _b = (a & b) << 1;
    		a = _a;
    		b = _b;
    	}
    	return a;
    }
}