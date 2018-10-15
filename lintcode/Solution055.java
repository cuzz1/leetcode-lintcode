package src;

public class Solution055 {
    /**
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
	public static void main(String[] args) {
		String A = "ABCD";
		String B = "ACD";
		boolean result = compareStrings(A, B);
		System.out.println(result);
	}
    public static boolean compareStrings(String A, String B) {
        // write your code here
    	// 记录A字符串的每个字母的个数
    	int[] aCount = new int[26];
    	int[] bCount = new int[26];
    	
    	for(int i = 0; i < A.length(); i++){
    		aCount[A.charAt(i) - 'A'] ++;
    	}
    	
    	for(int i = 0; i < B.length(); i++){
    		bCount[B.charAt(i) - 'A'] ++;
    	}
    	
    	int length = 26;
    	for(int j = 0; j < length; j++){
    		if(bCount[j] > aCount[j]){
    			return false;
    		}
    	}
    	return true;	
    }
}