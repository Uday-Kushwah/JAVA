/* 
Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number. Write a recursive function which returns an array containing indices of all items in the array which have value equal to M. Print all the values in the returned array.


Input Format
Enter a number N(size of the array) and add N more numbers to the array Enter number M to be searched in the array


Constraints
1 <= Size of array <= 10^5


Output Format
Display all the indices at which number M is found in a space separated manner


Sample Input
5
3
2
1
2
3
2
Sample Output
1 3
Explanation
2 is found at indices 1 and 3.
 */

package Assignment.Assignment_06;

import java.util.Scanner;

public class All_Index {

    public static void printAllIndexes(int[] arr, int target, int i) {

        if(i == arr.length) return;

        if(arr[i] == target) {
            System.out.print(i+" ");    
        }
        printAllIndexes(arr, target, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]  = sc.nextInt();
        }
        int target = sc.nextInt();
        printAllIndexes(arr, target, 0);
        sc.close();
    }
}
