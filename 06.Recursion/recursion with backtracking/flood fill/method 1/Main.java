import java.util.*;

// WITH USING BOOLEAN ARRAY TO MARK TRUE OR FALSE 

public class Main {
    public static void floodFill(int[][] maze, int sr, int sc, String asf, boolean[][] ans) {
        if (sr > maze.length - 1 || sc > maze[0].length - 1 || sr < 0 || sc < 0 || maze[sr][sc] == 1
                || ans[sr][sc] == true) {
            return;
        }

        if (sr == maze.length - 1 && sc == maze[0].length - 1) {
            System.out.println(asf);
            return;
        }

        ans[sr][sc] = true;
        floodFill(maze, sr - 1, sc, asf + "t", ans);
        floodFill(maze, sr, sc - 1, asf + "l", ans);
        floodFill(maze, sr + 1, sc, asf + "d", ans);
        floodFill(maze, sr, sc + 1, asf + "r", ans);
        ans[sr][sc] = false;
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

        boolean[][] ans = new boolean[n][m];

        floodFill(maze, 0, 0, "", ans);
    }

}