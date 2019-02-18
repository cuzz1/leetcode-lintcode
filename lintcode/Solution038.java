public class Solution {
    /**
     * @param matrix: A list of lists of integers
     * @param target: An integer you want to search in matrix
     * @return: An integer indicate the total occurrence of target in the given matrix
     */
    public int searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;
        int count = 0;
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        
        int x = 0;
        int y = col;
        
        while (x <= row && y >= 0) {
            if (matrix[x][y] == target) {
                count++;
                y--;
                x++;
            } else if (matrix[x][y] > target) {
                y--;
            } else {
                x++;
            }
        }
        return count;
    }
}
