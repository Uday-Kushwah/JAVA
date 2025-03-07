package Assignment.Assignment_06;

import java.util.Scanner;

public class Rat_in_Maze {

    static boolean isPathExists = true;
    public static void FindPath(int[][] maze,int cr, int cc,String ans) {

        if(cr == maze.length-1 && cc == maze.length-1) {
            System.out.println(ans);
            isPathExists = false;
            return;
        }
        if(cr < 0 || cc < 0 || cr >= maze.length || cc >= maze.length || maze[cr][cc] == 0) {
            return;
        }
        maze[cr][cc] = 0;
        FindPath(maze, cr-1, cc, ans+"U");
        FindPath(maze, cr+1, cc, ans+"D");
        FindPath(maze, cr, cc-1, ans+"L");
        FindPath(maze, cr, cc+1, ans+"R");
        maze[cr][cc] = 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] maze = new int[n][n];
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        FindPath(maze, 0, 0, "");
        if (isPathExists) {
            System.out.println("");
            // return ;
        }
        sc.close();
    }
}
