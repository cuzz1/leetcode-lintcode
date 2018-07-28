package src;

public class Solution028 {
    /**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int row = matrix.length - 1;
        int column = matrix[0].length - 1;
        
        int i = 0;
        int j = column;
        
        while (i <= row && j >= 0) {
            if (target < matrix[i][j]) {
                j--;
            } else if (target > matrix[i][j]) {
                i++;
            } else {
                return true;
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