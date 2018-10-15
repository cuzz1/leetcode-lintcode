package src;

public class Solution157 {
    /*
     * @param str: A string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
    	
    	boolean[] str_flag = new boolean[256];
    	
    	for (int i = 0; i < str.length(); i++) {
    		
    		if (str_flag[str.charAt(i)]) {
    			return false;
    		}
    		
    		str_flag[str.charAt(i)] = true;
    	}
    	return true;
    }
}