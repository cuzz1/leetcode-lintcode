public class Solution {
    /**
     * @param matrix: a matrix of m x n elements
     * @return: an integer list
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return res;
        if (matrix[0] == null || matrix[0].length == 0) return res;
        
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;
        
        while (rowStart <= rowEnd && colStart <= colEnd) {
            
            for (int i = colStart; i <= colEnd; i++) {
                res.add(matrix[rowStart][i]);
            }
            rowStart++;
            
            for (int i = rowStart; i <= rowEnd; i++) {
                res.add(matrix[i][colEnd]);
            }
            colEnd--;
            
            if (rowEnd >= rowStart) {
                for (int i = colEnd; i >= colStart; i--) {
                    res.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            
            if (colEnd >= colStart) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    res.add(matrix[i][colStart]);   
                }
            }
            colStart++;
            
                    
        }
        return res;
        
    }
}
