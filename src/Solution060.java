package src;

public class Solution060 {
    /**
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: An integer
     */
	public static void main(String[] args) {
		int[] A = new int[]{1, 3, 5, 6};
		int result = searchInsert(A, 7);
		System.out.println(result);
	}
    public static int searchInsert(int[] A, int target) {
        // write your code here
    	int i = 0;
    	for(i = 0; i < A.length; i++){
    		if (target <= A[i]){
    			return i;
    		}
    	}
    	return i;
    }
}