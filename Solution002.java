
public class Solution002 {
    /*
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
	public static void main(String[] args) {
		System.out.println(trailingZeros(100));
	}
    public static long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
    	
    	// 分解成2*5来算 统计5的个数就可以
    	// 25 中有2个5
    	long count = 0;
    	
    	// 比如 n = 100 第一次可以分为5 x 20 
    	// 在加上 20 = 5 x 4 中的4就可以
    	long t = 5;
    	while(t <= n){
    		count += n / t;
    		n /= 5;
    	} 	
    	return count;
    }
}