package src;

public class Solution028 {
    /**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		boolean result = searchMatrix(matrix, 3);
		System.out.println(result);
	}
    public static boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
    	boolean flag = false;
    	for(int i = 0; i < matrix.length; i++){
    		for(int j = 0; j < matrix[i].length; j++){
    			if(matrix[i][j] == target){
    				return true;
    			}
    		}
    	}
    	return false;
    }
}