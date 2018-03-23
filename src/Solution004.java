package src;

public class Solution004 {
    /**
     * @param n: An integer
     * @return: the nth prime number as description.
     */
	public static void main(String[] args) {
		int count = nthUglyNumber(41);
		System.out.println(count);
	}
    public static int nthUglyNumber(int n) {
        // write your code here
    	int[] num = new int[n];
    	// 添加第一个丑数
    	num[0] = 1;
    	int p2 = 0, p3 = 0, p5 = 0;
    	
    	for(int i = 1; i < n; i++){
    		// 比较的数
    		int lastNumber = num[i-1];
    		
    		while(num[p2]*2 <= lastNumber){
    			p2++;
    		}
    		while(num[p3]*3 <= lastNumber){
    			p3++;
    		}
    		while(num[p5]*5 <= lastNumber){
    			p5++;
    		}
    		
    		int minNumber = min(min(num[p2]*2, num[p3]*3), num[p5]*5);
    		num[i] = minNumber;
    	}
    	return num[n-1];
    }
	private static int min(int i, int j) {
		if(i >= j){
			return j;
		}else{
			return i;
		}
	}
}