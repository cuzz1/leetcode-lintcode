package src;

import java.util.ArrayList;
import java.util.List;

public class Solution053 {
    /*
     * @param s: A string
     * @return: A string
     */
	public static void main(String[] args) {
		String s = " the world is so big that i want to see it  ";
		String str = reverseWords(s);
		System.out.println(str);
	}
    public static String reverseWords(String s) {
        // write your code here
    	if (s.length() == 0 || s.equals(" ")){
    		return "";
    	}
    	
    	String[] array = s.split(" ");
    	StringBuilder sb = new StringBuilder();
    	for (int i = array.length - 1; i >= 0; i--){
    		if (!array[i].equals(" ")){  			
    			if(sb.length() > 0){
    				sb.append(" ");
    			}
    			sb.append(array[i]);
    		}
    	}
    	return sb.toString();
    }
}