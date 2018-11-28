class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (exist(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean exist(char[][] board, String word, int i, int j, int start) {
        // 找到了
        if (start > word.length() - 1) return true;
        // 越界
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return false;
        if (board[i][j] == word.charAt(start++)) {
            char c = board[i][j];
            // 表示已经走过了
            board[i][j] = '*';
            // 上下左右
            boolean res = exist(board, word, i - 1, j, start) 
                || exist(board, word, i + 1, j, start)
                || exist(board, word, i, j - 1, start)
                || exist(board, word, i, j + 1, start);
            // 回溯
            board[i][j] = c;
            return res;
        }
        return false;
    }
}
