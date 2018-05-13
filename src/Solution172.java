package src;

public class Solution172 {
    /*
     * @param A: A list of integers
     * @param elem: An integer
     * @return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        // write your code here
    	
    	int pointer = A.length - 1;
    	int i = 0;
    	while(i <= pointer) {
    		if (A[i] == elem) {
    			A[i] = A[pointer];
    			pointer--;
    		} else {
    			i++;
    		}
    	}
    	return pointer + 1;
    }
}