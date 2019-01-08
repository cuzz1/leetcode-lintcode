public class Solution {
    /**
     * @param grid: a list of lists of integers
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        if (grid == null) return 0;
        if (grid.length == 0 || grid[0].length == 0) return 0;
        
        int len = grid.length;
        int[][] matrix = new int[len][len];
        
        matrix[0][0] = grid[0][0];
        for (int i = 1; i < len; i++) {
            matrix[0][i] = matrix[0][i-1] + grid[0][i];
        }
        for (int i = 1; i < len; i++) {
            matrix[i][0] = matrix[i-1][0] + grid[i][0];
        }
        for (int i = 1; i < len; i++) {
            for (int j = 1; j < len; j++) {
                matrix[i][j] = grid[i][j] + Math.min(matrix[i-1][j], matrix[i][j-1]);
            }
        }
        return matrix[len-1][len-1];
    }
    
    private void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
