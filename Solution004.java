
public class Solution004 {
    /**
     * @param n: An integer
     * @return: the nth prime number as description.
     */
	public static void main(String[] args) {
		int count = nthUglyNumber(10);
		System.out.println(count);
	}
    public static int nthUglyNumber(int n) {
        // write your code here
    	if(n < 0){
    		return 0;
    	}
    	int count = 0;
    	for(int i = 1; i <= n; i++){
    		int flag = i;
    		while(flag % 2 == 0){
    			flag /= 2;
    		}
    		while(flag % 3 == 0){
    			flag /= 3;
    		}
    		while(flag % 5 == 0){
    			flag /= 5;
    		}
    		if(flag == 1){
    			count++;
    		}
    	}
    	
    	return count;
    	
    }
}