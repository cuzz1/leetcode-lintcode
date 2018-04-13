package src;

public class Solution115 {
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	if (obstacleGrid == null && obstacleGrid.length == 0 
    			&& obstacleGrid[0].length == 0) {
    		return 0;
    	}

    	
    	// 列数
    	int m = obstacleGrid.length;
    	// 行数
    	int n = obstacleGrid[0].length;
    	
    	int[][] twoArray = new int[m][n];
    	
    	// 对行和列赋值
    	twoArray[0][0] = 1;
    	
    	// 列赋值 
    	for (int i = 0; i < m; i++) {
    		if (obstacleGrid[i][0] != 1) {
    			twoArray[i][0] = 1;
    		} else {
    			break;
    		}
    	}
    	
    	// 行赋值
    	for (int j = 0; j < n; j++) {
    		if (obstacleGrid[0][j] != 1) {
    			twoArray[0][j] = 1;
    		} else {
    			break;
    		}
    	}
    	
    	for (int i = 1; i < m; i++) {
    		for (int j = 1; j < n; j++) {
    			if (obstacleGrid[i][j] != 1) {
    				twoArray[i][j] = twoArray[i-1][j] + twoArray[i][j-1];
    			} else {
    				twoArray[i][j] = 0;
    			}
    		}
    	}
    	return twoArray[m-1][n-1];
    }
}