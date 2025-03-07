package BackTracking.Hard;

public class N_QueensPrac {

    public static void Display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean IsItSafe(boolean[][] board, int totalQueen, int row, int col) {

        // checking in upward direction
        int r = row;
        while (r >= 0) {
            if (board[r][col] == true) {
                return false;
            }
            r--;
        }

        // checking in upward left direction(left diagonal)
        r = row;
        int c = col;
        while (r >= 0 && c >= 0 ) {
            if(board[r][c] == true) {
                return false;
            }
            r--;
            c--;
        }
        // checking in upward right direction(right diagonal)
        r = row;
        c = col;
        while (r >= 0 && c < board.length ) {
            if(board[r][c] == true) {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }

    public static void Queen(boolean[][] board, int totalQueen, int row) {

        if (totalQueen == 0) {
            Display(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (IsItSafe(board, totalQueen, row, col)) {
                board[row][col] = true;
                Queen(board, totalQueen - 1, row + 1);
                board[row][col] = false;
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        Queen(board, n, 0);
    }
}
