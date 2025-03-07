package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Practice {

    // public static void Combination(int[] coin, int curr , int amount, String ans, int idx) {
    //     if(amount == curr) {
    //         System.out.println(ans+ " ");
    //         return;
    //     }
        
    //     for (int i = idx; i < coin.length; i++) {
    //         if(curr <= amount) {
    //             Combination(coin, curr+coin[i], amount , ans+coin[i]+" ",i);
    //         }
    //     }
    // } 
    // public static void main(String[] args) {
    //     int[] coin = {2,3,6,7};
    //     int amount = 7;
    //     Combination(coin, 0, amount,"", 0);

    // } 
 

    public static void Combination(List<List<Integer>> ans,int[] coin, int curr , int amount, List<Integer> lst, int idx) {
        if(amount == curr) {
            ans.add(new ArrayList<>(lst));
            return;
        }
         
        for (int i = idx; i < coin.length; i++) {
            if(curr <= amount) {
                lst.add(coin[i]);
                Combination(ans,coin, curr+coin[i], amount , lst, i);
                lst.remove(lst.size()-1);
            }
        }
    } 
    public static void main(String[] args) {
        int[] coin = {1,3,6,7};
        int amount = 7;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        Combination(ans,coin, 0, amount,lst, 0);
        System.out.println(ans);

    }
}
