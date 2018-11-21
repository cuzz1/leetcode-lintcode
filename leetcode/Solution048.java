class Solution {
    public void rotate(int[][] matrix) {
        /*
          先通过对角线变换，再通过中心变换  
            [1,2,3]  1 4 7  7 4 1
            [4,5,6]  2 5 8  8 5 2
            [7,8,9]  3 6 9  9 6 3
        */
        
        if (matrix == null || matrix.length == 0) return;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length - 1 - j];
                matrix[i][matrix[0].length  - 1 - j] = temp;
            }
        }
    }
}
