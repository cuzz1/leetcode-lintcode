public class Solution {
    /**
     * @param matrix: a matrix of m x n elements
     * @return: an integer list
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return list;
        
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;
        
        while (rowStart <= rowEnd && colStart <= colEnd) {
            
            // 左到右
            for (int i = colStart; i <= colEnd; i++) {
                list.add(matrix[rowStart][i]);
            }
            rowStart++;
            
            // 上到下
            for (int i = rowStart; i <= rowEnd; i++) {
                list.add(matrix[i][colEnd]);
            }
            colEnd--;
            
            // 右到左
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    list.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            
            // 下到上
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    list.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }
        return list;
    }
}
