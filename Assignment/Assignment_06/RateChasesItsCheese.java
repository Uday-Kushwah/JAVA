/* 
You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty. The rat can move from a position towards left, right, up or down on the grid.
Initially rat is on the position (1,1). It wants to reach position (N,M) where it's cheese is waiting for. If a path exists-it is always unique. Find that path and help the rat reach its cheese.


Input Format
First line contains 2 integers N and M denoting the rows and columns in the grid.
Next N line contains M characters each. An 'X' in position (i,j) denotes that the cell is blocked and ans 'O' denotes that the cell is empty.


Constraints
1 <= N , M <= 10


Output Format
Print N lines, containing M integers each. A 1 at a position (i,j) denotes that the (i,j)th cell is covered in the path and a 0 denotes that the cell is not covered in the path.
If a path does not exits then print "NO PATH FOUND"


Sample Input
5 4
OXOO
OOOX
XOXO
XOOX
XXOO
Sample Output
1 0 0 0 
1 1 0 0 
0 1 0 0 
0 1 1 0 
0 0 1 1 
 */

package Assignment.Assignment_06;

import java.util.Scanner;


public class RateChasesItsCheese {

    public static void DisplayPath(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    static boolean isPathExists = false;
    public static void UniquePath(char[][] board,int cr, int cc, int[][] ans) {

        if(cr == board.length-1 && cc == board[0].length-1) {
            ans[cr][cc] = 1;
            DisplayPath(ans);
            isPathExists = true;
            return;
        }
        
        if(cr < 0 || cc < 0 || cr >= board.length || cc >= board[0].length || board[cr][cc] == 'X') {
            return;
        }
        board[cr][cc] = 'X';
        ans[cr][cc] = 1;
        UniquePath(board, cr-1, cc, ans);
        UniquePath(board, cr, cc-1, ans);
        UniquePath(board, cr+1, cc, ans);
        UniquePath(board, cr, cc+1, ans);
        board[cr][cc] = 'O';
        ans[cr][cc] = 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        char[][] board = new char[row][col];
        for (int i = 0; i < board.length; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                board[i][j] = s.charAt(j);
            }
        }
        int[][] ans = new int[row][col];
        UniquePath(board, 0, 0, ans);
        if(isPathExists == false) {
            System.out.println("NO PATH FOUND");
        }
        sc.close();
    }
}
