class Solution {
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return dfs(0, 0, m, n, k, visited);
    }

    private int dfs(int i, int j, int m, int n, int k, boolean[][] visited) {
        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j] || (getSum(i) + getSum(j)) > k) return 0;
        visited[i][j] = true;
        return 1 + dfs(i+1, j, m, n, k, visited) + dfs(i, j+1, m, n, k, visited);
    }

    private int getSum(int i) {
        int sum = 0;
        while (i != 0) {
            sum += (i % 10);
            i = i / 10;
        }
        return sum;
    }
}
