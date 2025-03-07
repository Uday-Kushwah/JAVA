package BackTracking;

public class CoinPermutation {

    public static void Permutation(int[] coin,int amount,String ans){
        if(amount == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < coin.length; i++) {
            if(amount >= coin[i]) {
                Permutation(coin, amount-coin[i], ans+coin[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] coin = {1,2,3,4,5};
        int amount = 5;
        Permutation(coin, amount, "");
    }
}
