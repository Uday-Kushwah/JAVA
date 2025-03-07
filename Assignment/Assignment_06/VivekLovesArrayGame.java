package Assignment.Assignment_06;

import java.util.Scanner;

public class VivekLovesArrayGame {

    public static void ArrayGame(int[] arr, int i) {

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            ArrayGame(arr,0); 
        }
    }
}
