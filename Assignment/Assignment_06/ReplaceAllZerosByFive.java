package Assignment.Assignment_06;

import java.util.Scanner;

public class ReplaceAllZerosByFive {

    
    public static void Replace_0_By_5(int n, int ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        int lastDigit = n % 10;
        int c = 0;
        if (lastDigit == 0) {
            lastDigit = 5;
            ans += lastDigit * (int)(Math.pow(10, c++)) ;
        } else {
            // ans = ans * 10 + lastDigit;
            ans += lastDigit * (int)(Math.pow(10, c++)) ;
        }
        n /= 10;
        Replace_0_By_5(n, ans);
    }

    // public static void Replace_0_By_5(int n, String ans) {
    //     if (n == 0) {
    //         System.out.println(ans);
    //         return;
    //     }
    //     int lastDigit = n % 10;
    //     if (lastDigit == 0) {
    //         ans = 5 + ans;
    //     } else {
    //         ans = lastDigit + ans;
    //     }
    //     n /= 10;
    //     Replace_0_By_5(n, ans);
    // }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 103;
        Replace_0_By_5(n, 0);
    }
}
