public class Solution {
    /**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        
        int rowStart = 0;
        int rowEnd = row;
        
        while (rowStart + 1 < rowEnd) {
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if (matrix[mid][col] == target) {
                return true;
            } else if (matrix[mid][col] < target) {
                rowStart = mid;
            } else {
                rowEnd = mid;
            }
        }
        
        int findRow = target <= matrix[rowStart][col] ? rowStart : rowEnd;
        
        int colStart = 0;
        int colEnd = col;
        while (colStart + 1 < colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (matrix[findRow][mid] == target) {
                return true;
            } else if (matrix[findRow][mid] < target) {
                colStart = mid;
            } else {
                colEnd = mid;
            }
        }
        if (matrix[findRow][colStart] == target || matrix[findRow][colEnd] == target) return true;
        
        return false;
    }
}
