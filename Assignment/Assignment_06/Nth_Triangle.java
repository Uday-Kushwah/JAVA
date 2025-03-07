/* 
 Take as input N, a number. Write a recursive function to find Nth triangle where 1st triangle is 1, 2nd triangle is 1 + 2 = 3, 3rd triangle is 1 + 2 + 3 = 6, so on and so forth. Print the value returned.


Input Format
Integer N is the single line of input.


Constraints
1 <= N <= 100


Output Format
Print the output as a single integer which is the nth triangle.


Sample Input
3
Sample Output
6
 */

package Assignment.Assignment_06;

import java.util.Scanner;

public class Nth_Triangle {

    public static void Triangle(int n, int sum) {
        if(n == 0) {
            System.out.println(sum);
            return;
        }
        sum += n;
        Triangle(n-1, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Triangle(n, 0);
        sc.close();
    }
}
