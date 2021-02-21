class Solution {
    public boolean exist(char[][] board, String word) {

        if (word == null || word.length() == 0) return true;
        if (board == null || board.length == 0 || board[0].length == 0) return false;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, String word, int index) {
        // 边界判断
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || index >= word.length() || board[i][j] != word.charAt(index)) return false;

        // 结果判断
        if (word.length() - 1 == index) {
            return true;
        }

        // 如果当前这个找过了，做一个标记
        board[i][j] = '.';

        boolean res = dfs(board, i + 1, j, word, index + 1)
            || dfs(board, i, j + 1, word, index + 1)
            || dfs(board, i - 1, j, word, index + 1)
            || dfs(board, i, j - 1, word, index + 1)
        ;

        // 复原
        board[i][j] = word.charAt(index);

        return res;
    }
}
