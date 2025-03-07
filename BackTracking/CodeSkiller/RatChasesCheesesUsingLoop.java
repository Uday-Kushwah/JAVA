package BackTracking.CodeSkiller;

import java.util.Scanner;

public class RatChasesCheesesUsingLoop {
    public static void DisplayPath(int[][] path) {
        for (int i = 0; i < path.length; i++) {
            for (int j = 0; j < path[0].length; j++) {
                System.out.print(path[i][j] + " ");
            }
            System.out.println();
        }
    }

    // cr -> current row, cc -> current column
    static boolean isPathExists = false;
    public static void UniquePath(char[][] Maze, int cr, int cc, int[][] ans) {

        if (cr == Maze.length - 1 && cc == Maze[0].length - 1) {
            ans[cr][cc] = 1;
            isPathExists = true;
            DisplayPath(ans);
            return;
        }
        if (cr < 0 || cc < 0 || cr >= Maze.length || cc >= Maze[0].length || Maze[cr][cc] == 'X') {
            return;
        }

        Maze[cr][cc] = 'X';
        ans[cr][cc] = 1;

        // -----------------------------------------------
        int[] row = {-1, 0, 1, 0};
        int[] col = {0, -1, 0, 1};
        for (int i = 0; i < col.length; i++) {
            UniquePath(Maze, cr+row[i], cc+col[i], ans);
        }
        /* UniquePath(Maze, cr - 1, cc, ans); // Upward Direction
        UniquePath(Maze, cr, cc - 1, ans); // Left Direction
        UniquePath(Maze, cr + 1, cc, ans); // Downward Direction
        UniquePath(Maze, cr, cc + 1, ans); // Right Direction */
        
        // -----------------------------------------------
        
        Maze[cr][cc] = 'O';
        ans[cr][cc] = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        char[][] Maze = new char[row][col];
        int[][] ans = new int[row][col];
        for (int i = 0; i < row; i++) {
            String path = sc.next();
            for (int j = 0; j < Maze[0].length; j++) {
                Maze[i][j] = path.charAt(j);
            }
        }
        UniquePath(Maze, 0, 0, ans);
        if(isPathExists == false) {
            System.out.println("NO PATH FOUND");
        }
        sc.close();
    }
}
