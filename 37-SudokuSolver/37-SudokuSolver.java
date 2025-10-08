// Last updated: 10/8/2025, 11:24:57 AM
class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    boolean solve(char board[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char ch='1';ch<='9';ch++){
                        if(check(board,i,j,ch)){
                            board[i][j]=ch;
                            if(solve(board)) return true;
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    boolean check(char[][] board, int row, int col, char ch) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == ch) return false;
            if (board[i][col] == ch) return false;
            int subRow = 3 * (row / 3) + i / 3;
            int subCol = 3 * (col / 3) + i % 3;
            if (board[subRow][subCol] == ch) return false;
        }
        return true;
    }

}