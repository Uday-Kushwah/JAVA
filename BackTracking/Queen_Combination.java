package BackTracking;

public class Queen_Combination {

    public static void permute(boolean[] box,String ans,int total_queen,int kon_si_queen_Baithegi,int idx) {
        if(total_queen == kon_si_queen_Baithegi) {
            System.out.println(ans);
            return;
        }

        for (int i = idx; i < box.length; i++) {
            if(box[i] != true) {
                box[i] = true;
                permute(box, ans+"b"+i+"q"+kon_si_queen_Baithegi, total_queen, kon_si_queen_Baithegi+1,i+1);
                box[i] = false;
            }
        }
    }

    
    public static void main(String[] args) {
        int n = 4;
        int tq = 2;         //total queen
        boolean[] box = new boolean[n];
        permute(box, "", tq, 0,0);
    }
}
