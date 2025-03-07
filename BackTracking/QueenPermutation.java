package BackTracking;

public class QueenPermutation {

    public static void Permutation(boolean[] board,int tq,String ans, int qpsf){
        if(qpsf == tq) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if(board[i] != true) {
                board[i] = true;
                Permutation(board, tq, ans+"b"+i+"q"+qpsf, qpsf+1);
                board[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int tq = 2;
        boolean[] board = new boolean[n];
        Permutation(board,tq,"",0);
    }
}
