/* 
 * Take as input N, a number. Print odd numbers in decreasing sequence (up until 0) and even numbers in increasing sequence (up until N) using Recursion


Input Format

Constraints
1 <= N <=1000


Output Format

Sample Input
5
Sample Output
5
3
1
2
4
 */

package Assignment.Assignment_06;

import java.util.Scanner;

public class OddEven {

    public static void OddDecreasing(int n) {
        if(n == -1) {
            return;
        }
        
        System.out.println(n);
        OddDecreasing(n-2);
    }
    public static void EvenIncreasing(int n) {
        if(n == 0) {
            return;
        }
    
        EvenIncreasing(n-2);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isodd = false;
        if(n % 2 == 1) {
            isodd = true;
        }
        if(isodd) OddDecreasing(n);
        else OddDecreasing(n-1);

        if(!isodd) EvenIncreasing(n);
        else EvenIncreasing(n-1);
        sc.close();
    }
}
