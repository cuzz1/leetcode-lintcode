package src;

import java.util.ArrayList;
import java.util.List;

public class Solution422 {
    /**
     * @param s: A string
     * @return: the length of last word
     */
    public int lengthOfLastWord(String s) {
        // write your code here
    	if (s == null || s.isEmpty()) {
    		return 0;
    	}
    	String[] array = s.split(" +");
    	return array[array.length-1].length();
    	
    }
}