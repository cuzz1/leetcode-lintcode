package src;

public class Solution221 {
    /**
     * @param A: a string
     * @param B: a string
     * @return: a boolean
     */
    public boolean Permutation(String A, String B) {
        // write your code here
    	if (A == null || B == null) {
    		return false;
    	}
    	
    	if (A.length() != B.length()) {
    		return false;
    	}
    	

    	int[] record_a = new int[256];
    	int[] record_b = new int[256];
    	
    	for (int i = 0; i < A.length(); i++) {
    		record_a[A.charAt(i)] ++;
    		record_b[B.charAt(i)] ++;
    	}
    	
    	for (int i = 0; i < A.length(); i++) {
    		if (record_a[i] != record_b[i]) {
    			return false;
    		}
    	}
		return true;
    }
}