package Assignment.Assignment_06;

import java.util.Scanner;

public class GenerateParenthesis {

    public static void Generate(int n, int open , int close, String ans) {
        if(n == open && n == close) {
            System.out.println(ans);
            return;
        }
        if(open > n || close > n || close > open) {
            return;
        }
        Generate(n, open, close+1, ans+")");
        Generate(n, open+1, close, ans+"(");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Generate(n, 0, 0, "");
    }
}
