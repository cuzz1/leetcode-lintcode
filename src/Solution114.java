package src;

public class Solution114 {
    /**
     * @param m: positive integer (1 <= m <= 100)
     * @param n: positive integer (1 <= n <= 100)
     * @return: An integer
     */
	public static void main(String[] args) {
		int result = uniquePaths(3, 3);
		System.out.println(result);
	}
	// 动态规划
    public static int uniquePaths(int m, int n) {
    	// 构建一个二维数组
    	int[][] twoArray = new int[m][n];
    	
    	// 对数组的第一行和第一列赋值
    	for(int i = 0; i < n; i++) {
    		twoArray[0][i] = 1;
    	}
    	
    	for (int j = 1; j < m; j++) {
    		twoArray[j][0] = 1;
    	}
    	
    	for (int i = 1; i < n; i++) {
    		for (int j = 1; j < m; j++) {
    			twoArray[j][i] = twoArray[j-1][i] + twoArray[j][i-1];
    		}
    	}
    	return twoArray[m-1][n-1];
    }
}