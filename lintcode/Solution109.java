public class Solution {
    /**
     * @param triangle: a list of lists of integers
     * @return: An integer, minimum path sum
     */
    public int minimumTotal(int[][] triangle) {
        if (triangle == null) return 0;
        if (triangle.length == 0 || triangle[0].length == 0) return 0;
        int length = triangle.length;
        int[][] array = new int[length][length];
        // 初始化 自底向上
        for (int i = 0; i < length; i++) {
            array[length - 1][i] = triangle[length - 1][i];
        }
        
        for (int i = length - 2 ; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                array[i][j] = triangle[i][j] + Math.min(array[i + 1][j], array[i + 1][j + 1]); 
            }
        }
        return array[0][0];
    }
}
