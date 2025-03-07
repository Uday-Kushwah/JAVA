package Assignment.Assignment_06;

import java.util.Scanner;

public class MazePath_Diagonal {


    public static int  MazePath_D(int row, int col, int hor, int ver, String ans) {
        if(hor == col && ver == row) {
            System.out.print(ans+" ");
            return 1;
        }
        if(hor > col || ver > row) {
            return 0;
        }
        int c1 = MazePath_D(row, col, hor, ver+1, ans+"V");
        int c2 = MazePath_D(row, col, hor+1, ver, ans+"H");
        int c3 = MazePath_D(row, col, hor+1, ver+1, ans+"D");
        return c1+c2+c3;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        // int row = 3;
        // int col = 3;
        System.out.println("\n"+MazePath_D(row-1, col-1, 0, 0, ""));
        sc.close();
    }
}
