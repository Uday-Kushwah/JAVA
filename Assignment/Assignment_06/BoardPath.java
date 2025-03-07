package Assignment.Assignment_06;

import java.util.Scanner;

public class BoardPath {

    public static int  Possible_Path(int n, int no_of_face, String ans, int curSum ) {
        if(curSum == n) {
            System.out.print(ans+" ");
            return 1;
        }

        if(curSum > n) {
            return 0;
        }
        int count =0 ;
        for (int dice = 1;dice <= no_of_face; dice++) {
            count += Possible_Path(n, no_of_face, ans+dice, curSum+dice);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int no_of_face = sc.nextInt();
        
        System.out.println("\n"+Possible_Path(n, no_of_face, "", 0));
    }
}
