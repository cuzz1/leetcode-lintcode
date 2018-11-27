class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        
        int low = 0;
        int high = row;
        
        while (low + 1 < high) {
            int mid = low + (high - low) / 2;
            
            if (matrix[mid][col] == target) {
                return true;   
            } else if (matrix[mid][col] > target){
                high = mid;
            } else {
                low = mid;
            }
        }
        int find = matrix[low][col] >= target ? low : high;
        
        int start = 0;
        int end = col;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            
            if (matrix[find][mid] == target) {
                return true;
            } else if (matrix[find][mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
            
        }
        
        if (matrix[find][start] == target || matrix[find][end] == target) return true;
        
        return false;
        
    }
}
