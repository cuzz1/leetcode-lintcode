public class Solution {
    /**
     * @param n: An integer
     * @return: a square matrix
     */
    public int[][] generateMatrix(int n) {
        if ( n < 0) {
            return null;
        }
        
        int[][] matrix = new int[n][n];
        int xStart = 0;
        int yStart = 0;
        
        int num = 1;
        
        while ( n > 0) {
            if (n == 1) {
                matrix[yStart][xStart] = num++;
                break;
            }
            
            // 从左到右
            for (int i = 0; i < n - 1; i++) {
                matrix[yStart][xStart + i] = num++;
            }
            
            // 从上到下
            for (int i = 0; i < n - 1; i++) {
                matrix[yStart + i][xStart + n -1] = num++;
            }
            
            // 从右到左
            for (int i = 0; i < n - 1; i++) {
                matrix[yStart + n - 1][xStart + n - 1 - i] = num++;
            }
            
            // 从下到上
            for (int i = 0; i < n - 1; i++) {
                matrix[yStart + n - 1 - i][xStart] = num++;
            }
            
            xStart++;
            yStart++;
            n = n - 2;
        }
        return matrix;
    
    }
}
