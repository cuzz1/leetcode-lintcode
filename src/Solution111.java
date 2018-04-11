package src;

public class Solution111 {
    /**
     * @param n: An integer
     * @return: An integer
     */
	public static void main(String[] args) {
		int result = climbStairs(3);
		System.out.println(result);
	}

	// 斐波那契数列 f(n) = f(n-1) + f(n-2)
    public static int climbStairs(int n) {
    	if (n <= 1) {
    		return n;
    	}
    	
    	int a = 1;
    	int b = 1;
    	for (int i = 2; i <= n; i++) {
    		int temp = b;
    		b = a + b;
    		a = temp;
    	}
    	return b;
    }
}