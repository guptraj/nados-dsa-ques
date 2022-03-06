import java.util.*;

public class Main {
    public static void floodFill(int[][] maze, int sr, int sc, String asf) {
        if (sr > maze.length - 1 || sc > maze[0].length - 1 || sr < 0 || sc < 0 || maze[sr][sc] == 1) {
            return;
        }

        if (sr == maze.length - 1 && sc == maze[0].length - 1) {
            System.out.println(asf);
            return;
        }

       maze[sr][sc] = 1;
        floodFill(maze, sr - 1, sc, asf + "t");
        floodFill(maze, sr, sc - 1, asf + "l");
        floodFill(maze, sr + 1, sc, asf + "d");
        floodFill(maze, sr, sc + 1, asf + "r");
        maze[sr][sc] = 0;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] maze = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maze[i][j] = scn.nextInt();
            }
        }

        floodFill(maze, 0, 0, "");
    }

}