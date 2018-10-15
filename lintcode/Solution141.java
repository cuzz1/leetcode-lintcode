package src;

public class Solution141 {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
	public static void main(String[] args) {
		int result = sqrt(5);
		System.out.println(result);
	}
	/*
	 * 二分思想
	 */
    public static int sqrt(int x) {
    	
    	long start = 1;
    	long end = x;
    	
    	// 找到一个数的平方无限接近x
    	while (start + 1 < end) {
    		long mid = (start + end) / 2;
    		System.out.println(start + " " + mid + " " + end);
    		if (mid * mid <= x) {
    			start = mid;
    		} else {
    			end = mid;
    		}
    	}
    	
    	if (end * end <= x) {
    		return (int) end;
    	} 
    	
    	return (int) start;
    }
}