/* 
 * Input : "abcd"
 * Output :  d c cd b bd bc bcd a ad ac acd ab abd abc abcd 
             16
 */

package Assignment.Assignment_06;

import java.util.Scanner;

public class SubSequences {

    public static int PrintSubSequences(String s, String ans) {
        if(s.length() == 0) {
            System.out.print(ans+" ");
            return 1;
        }
        char ch = s.charAt(0);
        int x1 = PrintSubSequences(s.substring(1), ans);
        int x2 = PrintSubSequences(s.substring(1), ans+ch);
        return x1+x2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = "abcd";
        String s = sc.next();
        System.out.println("\n"+ PrintSubSequences(s, ""));
    }
}
