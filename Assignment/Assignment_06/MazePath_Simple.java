package Assignment.Assignment_06;

import java.util.Scanner;

public class MazePath_Simple {
    public static int  MazePath(int row, int col, int hor, int ver, String ans) {
        if(hor == col && ver == row) {
            System.out.print(ans+" ");
            return 1;
        }
        if(hor > col || ver > row) {
            return 0;
        }
        int c1 = MazePath(row, col, hor, ver+1, ans+"V");
        int c2 = MazePath(row, col, hor+1, ver, ans+"H");
        return c1+c2;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        // int row = 3;
        // int col = 3;
        System.out.println("\n"+MazePath(row-1, col-1, 0, 0, ""));
        sc.close();
    }
}
