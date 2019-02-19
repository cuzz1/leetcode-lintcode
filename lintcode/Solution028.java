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
        
        int startRow = 0;
        int endRow = row;
        
        while (startRow + 1 < endRow) {
            int midRow = startRow + (endRow - startRow) / 2;    
            if (matrix[midRow][col] == target) {
                return true;
            } else if (matrix[midRow][col] > target) {
                endRow = midRow;
            } else {
                startRow = midRow;
            }
        }
        int rowIndex = endRow;
        if (matrix[startRow][col] >= target) {
            rowIndex = startRow;
        }
        System.out.print(rowIndex);
        int startCol = 0;
        int endCol = col;
        
        while (startCol + 1 < endCol) {
            int midCol = startCol + (endCol - startCol) / 2;
            if (matrix[rowIndex][midCol] == target) {
                return true;
            } else if (matrix[rowIndex][midCol] > target) {
                endCol = midCol;
            } else {
                startCol = midCol;
            }
        }
        
        if (matrix[rowIndex][startCol] == target || matrix[rowIndex][endCol] == target) {
            return true;
        }
        return false;
    }
}
