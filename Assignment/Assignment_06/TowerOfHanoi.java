package Assignment.Assignment_06;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void TOH(int n, String src, String helper, String dest) {
        if(n == 0) {
            return;
        }
        TOH(n-1, src, dest, helper);
        System.out.println("Moving ring "+n+" from "+src+" to "+dest);
        TOH(n-1, helper, src, dest);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TOH(n, "A","C","B");
        sc.close();
    }
}
 