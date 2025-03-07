package Assignment.Assignment_06;

import java.util.Scanner;

public class Twins {

    /* public static void findTwins(String str , int count, int i) {
        if(str.length() == i) {
            System.out.println(count);
            return;
        }
        if(i < str.length()-2 && str.charAt(i) == 'A' && str.charAt(i+1)=='X' && str.charAt(i+2)=='A') {
            count++;
        }
        if(i < str.length()-2 && str.charAt(i) == 'X' && str.charAt(i+1)=='A' && str.charAt(i+2)=='X') {
            count++;
        }
        findTwins(str, count, i+1);
    } */

    // public static int CountfindTwins(String str , int count, int i) {
    //     if(str.length() == i) {
    //         return count;
    //     }
    //     if(i < str.length()-2 && str.charAt(i) == 'A' && str.charAt(i+1)=='X' && str.charAt(i+2)=='A') {
    //         count++;
    //     }
    //     if(i < str.length()-2 && str.charAt(i) == 'X' && str.charAt(i+1)=='A' && str.charAt(i+2)=='X') {
    //         count++;
    //     }
    //     return CountfindTwins(str, count, i+1);
    // }



    public static void findTwins(String str , int count, int i) {
        if(str.length() == i) {
            System.out.println(count);
            return;
        }
        if(i < str.length()-2 && str.charAt(i) == str.charAt(i+2)) {
            count++;
        }
        
        findTwins(str, count, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // String str = "AXAXA";
        
        findTwins(str, 0, 0);
        // System.out.println(CountfindTwins(str, 0, 0));
        sc.close();
    }
}
