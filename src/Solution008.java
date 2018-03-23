package src;

public class Solution008 {
    /**
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
	public static void main(String[] args) {
		char[] str = {'a','b','c'};
		rotateString(str, 4);
		System.out.println(str);
		
	}
    public static void rotateString(char[] str, int offset) {
        // write your code here
    	int N = str.length;
    	char[] str2 = new char[str.length];
    	for(int i = 0; i < N; i++){
    		str2[i] = str[i];
    	}
    	
    	for(int i = 0; i < N; i++){
    		if(offset != 0){
    			str[(i+offset) % N] = str2[i];
    		}
    			
    	}   	
    }
}