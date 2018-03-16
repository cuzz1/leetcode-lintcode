
public class Solution003 {
    /*
     * @param : An integer
     * @param : An integer
     * @return: An integer denote the count of digit k in 1..n
     */
	public static void main(String[] args) {
		int count = digitCounts(12, 1);
		System.out.println(count);
	}
    public static int digitCounts(int k, int n) {
        // write your code here
    	String str = "";
    	int count = 0;
    	for(int i = 0; i <= k; i++){
    		str = str + i;
    	}
    	
    	for(int i = 0; i < str.length(); i++){
    		if((str.charAt(i)+ "").equals(n+"")){

    			count++;
    		}
    	}
    	return count;
    }
};