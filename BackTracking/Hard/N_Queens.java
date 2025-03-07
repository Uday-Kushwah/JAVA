// https://leetcode.com/problems/n-queens/description/

package BackTracking.Hard;
import java.util.ArrayList;
import java.util.List;


public class N_Queens {

    public static boolean isItSafe(boolean[][] board, int row, int col) {
       
        //Upward Direction
        int r = row;
        while (r >= 0) {
            if(board[r][col]) {
                return false;
            }
            r--;
        }
 
        //Diagonal Right
        r = row;
        int c = col;
        while (r >= 0 && c < board.length) {
            if(board[r][c]) {
                return false;
            }
            r--;
            c++;
        }
        r = row;
        c = col;
        while (r >= 0 && c >=0) {
            if(board[r][c]) {
                return false;
            }
            r--;
            c--;
        }
        return true;

    }

    public static void Display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void queen(boolean[][] board, int row, int tq) {
        if(tq == 0 ) {
            Display(board);
            System.out.println();
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if(isItSafe(board,row,col)) {
                board[row][col] = true;
                queen(board,row+1,tq-1);
                board[row][col] = false;
            }
        }
    }
    public static void main(String[] args) {
        int n = 5;
        // List<List<String>> ChessBoard = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        queen(board, 0, n);

    }
}
