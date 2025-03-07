package Assignment.Assignment_06;

import java.util.Scanner;

public class LastIndex {
    public static int printLastIndexes(int[] arr, int target, int i) {
        if(arr[i] == target) {
            return i;
        }
        if(i == 0) {
            return -1;
        }
        return printLastIndexes(arr, target, i-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]  = sc.nextInt(); 
        }
        int target = sc.nextInt();
        System.out.println(printLastIndexes(arr, target, n-1));
        sc.close();
    }
}
