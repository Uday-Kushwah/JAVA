/* 
  Input : 12
   output : ad ae af bd be bf cd ce cf 
            9
 */

package Assignment.Assignment_06;

import java.util.Scanner;

public class KeypadCodes {

    static String Key[] = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
    public static int ButtonCombination(String num, String ans) {
        if(num.length() == 0) {
            System.out.print(ans+" ");
            return 1;
        }
        char ch = num.charAt(0);
        int count= 0;
        String getString = Key[ch-'0'];
        for (int i = 0; i < getString.length(); i++) {
            count += ButtonCombination(num.substring(1), ans+getString.charAt(i));
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = n+"";
        
        System.out.println("\n"+ButtonCombination(num, ""));
    }
}
