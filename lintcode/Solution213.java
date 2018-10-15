package src;

import java.util.HashMap;
import java.util.Map;

public class Solution213 {
	public static void main(String[] args) {
		String str = "baaaaaaaaaaaaaaawwwwwwwwwww";
		String res = compress(str);
		System.out.println(res);
	}
    /**
     * @param str: a string
     * @return: a compressed string
     */
    public static String compress(String str) {
        // write your code here
    	if (str == null || str.length() == 0) {
    		return str;
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	
    	char pre = str.charAt(0);
    	int count = 1;
    	
    	for (int i = 1; i < str.length(); i++) {
    		char cur = str.charAt(i);
    		if (cur != pre) {
//    			if (count == 1) {
//    				sb.append("" + pre);
//    			}else {
    				sb.append("" + pre + count);
//    			}
    			pre = cur;
    			count = 1;
    		} else {
    			count ++;
    		}
    	}
    	sb.append("" + pre + count);
    	
    	String str2 = sb.toString();
    	
    	return  str.length() <= str2.length() ? str : str2;
    	
    }
}