package src;

public class Solution212 {
    /*
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        // write your code here
    	int newLength = length;
    	int space = 0;
    	for (int i = 0; i < length; i++) {
    		if (string[i] == ' ') {
    			space++;
    		}
    	}
    	
    	newLength = newLength + space * 2;
    	
    	int index = newLength;
    	
    	// 从最后开始循环
    	for (int i = length -1; i >= 0; i--) {
    		if (string[i] == ' ') {
    			string[--index] = '0';
    			string[--index] = '2';
    			string[--index] = '%';
    		} else {
    			string[--index] = string[i];
    		}
    	}
    	return newLength;
    }
}