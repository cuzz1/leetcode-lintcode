class Solution {
    public int minPathSum(int[][] grid) {
        
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int row = grid.length;
        int col = grid[0].length;
        
        // this.print(grid);
        
        int[][] res = new int[row][col]; 
        
        res[0][0] = grid[0][0];
        
        for (int i = 1; i < row; i++) {
            res[i][0] = res[i-1][0] + grid[i][0];
        }
        // this.print(res);
            
        for (int i = 1; i < col; i++) {
            res[0][i] = res[0][i-1] + grid[0][i];
        }
                                      
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                res[i][j] = grid[i][j] + (res[i-1][j] > res[i][j-1] ? res[i][j-1] : res[i-1][j]);
            }
        }
        return res[row-1][col-1];
    }
    
    private void print(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }
}
