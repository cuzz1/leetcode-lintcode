package src;

public class Solution209 {
    /**
     * @param str: str: the given string
     * @return: char: the first unique character in a given string
     */
    public char firstUniqChar(String str) {
        // Write your code here
    	if (str == null || "".equals(str)) {
    		return Character.MIN_VALUE;
    	}
    	
    	int[] record = new int[256];
    	for (int i = 0; i < str.length(); i ++) {
    		record[str.charAt(i)] ++;
    	}
    	
    	for (int i = 0; i < str.length(); i++) {
    		if (record[str.charAt(i)] == 1) {
    			return str.charAt(i);
    		}
    	}
		return Character.MIN_VALUE;
    }
}