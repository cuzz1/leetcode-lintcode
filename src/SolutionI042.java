package src;

public class SolutionI042 {
    /**
     * @param matrix: the given matrix
     * @return: True if and only if the matrix is Toeplitz
     */
    public boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix == null) {
            return false;
        }
        
        if (matrix.length == 0 || matrix[0].length == 0) {
            return true;
        }
        
        int M = matrix.length - 1;
        int N = matrix[0].length - 1;
        
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] != matrix[i+1][j+1]) {
                    return false;
                }
            }
        }
        return true;
    }
}