public class Solution {
    /**
     * @param matrix: a matrix of m x n elements
     * @return: an integer list
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }
        
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;
        
        while (rowStart <= rowEnd && colStart <= colEnd) {
            int i = rowStart;
            int j = colStart;
            while (j <= colEnd) {
                result.add(matrix[i][j]);
                j++;
            }
            j--;
            i++;
            
            while (i <= rowEnd) {
                result.add(matrix[i][j]);
                i++;    
            }
            i--;
            j--;
            
            // 判断是不是在同一行
            while (j > colStart && rowStart != rowEnd) {
                result.add(matrix[i][j]);
                j--;
            }
            
            // 判断是不是在同一列
            while (i > rowStart && colStart != colEnd) {
                result.add(matrix[i][j]);
                i--;
            }
            
            colStart++;
            rowStart++;
            colEnd--;
            rowEnd--;
        
        }
        return result;
    }
}
