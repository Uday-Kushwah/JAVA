package Assignment.Assignment_06;

import java.util.Scanner;

public class GenerateBinaryString {

    public static void BinaryString( String given,String ans,int i) {
        if(i == given.length()) {
            System.out.print(ans+" ");
            return;
        }

        if(given.charAt(i) == '?') {
            BinaryString(given, ans+"0", i+1);
            BinaryString(given, ans+"1", i+1);
        } else {
            BinaryString(given, ans+given.charAt(i), i+1);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            BinaryString(s, "", 0);
        }
    }
}
