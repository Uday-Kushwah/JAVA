package BackTracking;

public class QueenCombination {
    
    public static void Combination(boolean[] Board, int tq,String ans,int qpsf,int idx) {
        if(qpsf == tq) {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < Board.length; i++) {
            if(Board[i] != true) {
                Board[i] = true;
                Combination(Board, tq, ans+"b"+i+"q"+qpsf, qpsf+1, i);
                Board[i] = false;
            }
        }

    }
    public static void main(String[] args) {
        int n = 4;
        int tq = 2;
        Boolean[] Board = new Boolean[n];
        Combination(Board, tq ,"", 0,0);
    }
}
