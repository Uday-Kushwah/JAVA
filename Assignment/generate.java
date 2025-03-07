package Assignment;

import java.util.Scanner;

public class generate {

    public static void Parenthesis(int n, int open, int close, String ans) {
        if(close == n && open == n) {
            System.out.println(ans);
            return;
        }

        if(close > n || open > n || close > open) {
            return;
        }
        
        Parenthesis(n, open, close+1, ans+")");
        Parenthesis(n, open+1, close, ans+"(");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = 3;
        Parenthesis(n, 0, 0, "");
    }
}
