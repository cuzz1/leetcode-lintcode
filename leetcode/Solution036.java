class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> rows = new HashSet<>();
            Set<Character> cols = new HashSet<>();
            Set<Character> tubes = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.' && !rows.add(board[i][j])) return false;
                if (board[j][i] != '.' && !cols.add(board[j][i])) return false;
                
                /*
                0 1 2 3 4 5 6 7 8  i
                
                0 0 0 3 3 3 6 6 6  rowIndex
                0 3 6 0 3 6 0 3 6  colIndex
                
                i = 0 rowIndex = 0 colIndex = 0
                0 1 2 3 4 5 6 7 8  j 
                
                0 0 0 1 1 1 2 2 2  r
                0 1 2 0 1 2 0 1 2  c

                */

                int rowIndex = 3 * (i / 3);
                int colIndex = 3 * (i % 3);
                int r = rowIndex + j / 3;
                int c = colIndex + j % 3;
                
                if (board[r][c] != '.' && !tubes.add(board[r][c])) return false;
            }
        }
        return true;
    }
}
