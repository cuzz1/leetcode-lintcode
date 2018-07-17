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
//public class Solution {
//    /**
//     * @param matrix: matrix, a list of lists of integers
//     * @param target: An integer
//     * @return: a boolean, indicate whether matrix contains target
//     */
//    public boolean searchMatrix(int[][] matrix, int target) {
//        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
//            return false;
//        }
//        int row = matrix.length;
//        int column = matrix[0].length;
//        int i;
//        for (i = 0; i < row; i++) {
//            if (target <= matrix[i][column - 1]) {
//                break;
//            }
//        }
//        if (i == row) {
//            return false;
//        }
//        for (int j = 0; j < column; j ++) {
//            if (matrix[i][j] == target) {
//                return true;
//            }
//        }
//        return false;
//    }
//}