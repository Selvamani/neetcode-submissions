class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if(board[r][c] == '.') {
                    continue;
                }
                int num = board[r][c] - '1';
                int boxId = (r/3)*3 + c/3;
                if(rows[r][num] || cols[c][num] || boxes[boxId][num]) {
                    return false;
                }
                rows[r][num] = true;
                cols[c][num] = true;
                boxes[boxId][num] = true;
            }   
        }
        return true;
    }
}
