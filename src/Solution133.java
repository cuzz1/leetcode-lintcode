package src;

import java.util.ArrayList;
import java.util.List;

public class Solution133 {
    /*
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    public List<String> longestWords(String[] dictionary) {
    	List<String> list = new ArrayList<String>();
    	int maxLen = 0;
    	for (int i = 0; i < dictionary.length; i++) {
    		if (dictionary[i].length() > maxLen) {
    			maxLen = dictionary[i].length();
    		}
    	}
    	
    	for (int i = 0; i < dictionary.length; i++) {
    		if (dictionary[i].length() == maxLen) {
    			list.add(dictionary[i]);
    		}
    	}
    	return list;
    }
}