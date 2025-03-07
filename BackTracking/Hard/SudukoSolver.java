package BackTracking.Hard;

public class SudukoSolver {

    public static void Display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean IsItSafe(int[][] board, int row, int col, int val) {
        // col ke liye check kar rhe hai,toh row constant
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == val) {
                return false;
            }
        }
        // row ke liye check kar rhe hai,toh col constant
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == val) {
                return false;
            }
        }

        // check for 3x3 matrix
        int c = col - col % 3;
        int r = row - row % 3;
        for (int i = r ; i < r+3; i++) {
            for (int j = c; j < c+3; j++) {
                if(board[i][j] == val) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void Suduko(int[][] board, int row, int col) {
        if (col == 9) {
            row++;
            col = 0;
        }
        if (row == 9) {
            Display(board);
            return;
        }
        for (int val = 1; val <= 9; val++) {
            if (board[row][col] != 0) {
                Suduko(board, row, col + 1);
                return;
            } else {
                if (IsItSafe(board, row, col, val)) {
                    board[row][col] = val;
                    Suduko(board, row, col + 1);
                    board[row][col] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                         { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                         { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                         { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                         { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                         { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                         { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                         { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                         { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        Suduko(grid, 0, 0);
    }
}
