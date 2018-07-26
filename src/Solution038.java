package src;

public class Solution038 {
    /**
     * @param matrix: A list of lists of integers
     * @param target: An integer you want to search in matrix
     * @return: An integer indicate the total occurrence of target in the given matrix
     */
    public int searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        
        int count = 0;
        
        int row = matrix.length - 1;
        int column = matrix[0].length - 1;
        
        int i = 0;
        int j = column;
        
        while (i <= row && j >= 0) {
            if (matrix[i][j] < target) {
                i++;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                count++;
                i++;
                j--;
            }
        }
    return count;
    }
}