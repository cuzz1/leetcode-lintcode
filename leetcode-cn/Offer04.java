class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        if (matrix.length == 0 || matrix[0].length == 0) return false;

        int row = matrix.length;
        int col = matrix[0].length;

        int i = 0;
        int j = col - 1;

        while (i < matrix.length && j >= 0) {
            int val = matrix[i][j];
            if (target > val) {
                i++;
            } else if (target < val) {
                j--;
            } else {
                return true;
            }
        }
        return false;

    }
}
