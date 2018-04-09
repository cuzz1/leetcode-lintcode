package src;

public class Solution110 {
    /**
     * @param grid: a list of lists of integers
     * @return: An integer, minimizes the sum of all numbers along its path
     */
	public static void main(String[] args) {
		int[][] grid= {{0}};
		int result = minPathSum(grid);
		System.out.println(result);
	}
	
    public static int minPathSum(int[][] grid) {
    	if (grid == null || grid.length == 0) {
    		return -1;
    	}
    	
    	if (grid[0].length == 0) {
    		return -1;
    	}
    	// m表示列
    	int m = grid.length;
    	// n表示行
    	int n = grid[0].length;
    	
    	int[][] f = new int[m][n];
    	
    	// 对第一列初始化
    	f[0][0] = grid[0][0];
    	for (int i = 1; i < m; i++) {
    		f[i][0] = f[i-1][0] + grid[i][0];
    	}
    	// 对第一行初始化
    	for (int j = 1; j < n; j++) {
    		f[0][j] = f[0][j-1] + grid[0][j];
    	}
    	
    	for (int i = 1; i < m; i++) {
    		for (int j = 1; j < n; j++) {
    			f[i][j] = Math.min(f[i-1][j], f[i][j-1]) + grid[i][j];
    		}
    	}
    	
    	int minNum = f[m-1][n-1];
    	return minNum;
    }
}