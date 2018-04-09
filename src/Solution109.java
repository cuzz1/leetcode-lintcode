package src;

import javax.swing.text.html.MinimalHTMLWriter;

public class Solution109 {
    /**
     * @param triangle: a list of lists of integers
     * @return: An integer, minimum path sum
     */
	public static void main(String[] args) {
		int[][] a = {{2},{3,4},{6,5,7},{4,1,8,3}};
		int result = minimumTotal(a);
	}

    public static int minimumTotal(int[][] triangle) {
    	if (triangle == null || triangle.length == 0) {
    		return -1;
    	}
    	if (triangle[0] == null || triangle[0].length == 0) {
    		return -1;
    	}
    	
    	// 构建n x n的矩阵
    	int n = triangle.length;
    	int[][] f = new int[n][n];
    	// 对第一列和斜边初始化
    	f[0][0] = triangle[0][0];
    	for (int i = 1; i < n; i++) {
    		f[i][0] = f[i-1][0] + triangle[i][0];
    		f[i][i] = f[i-1][i-1] + triangle[i][i];
    	}
    	
    	// 至上而下
    	for (int i = 1; i  < n; i++) {
    		for (int j = 1; j < i; j++) {
    			f[i][j] = Math.min(f[i-1][j], f[i-1][j-1]) + triangle[i][j];
    		}
    	}

    	// 在最后一行找
    	int best = f[n-1][0];
    	for (int i = 1; i < n; i++) {
    		best = Math.min(best, f[n-1][i]);
    	}
		int l = f.length;
		for (int i : f[l-1]) {
			System.out.println(i);
		}
    	return best;
	}
}