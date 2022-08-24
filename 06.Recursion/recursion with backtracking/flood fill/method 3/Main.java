import java.util.*;

// WITH THE USE OF DIRECTIONAL ARRAY 

public class Main {

    static int[][] dir = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
    static String[] dirN = { "t", "l", "d", "r" };

    public static void floodFill(int[][] maze, int sr, int sc, String asf) {
        if (sr > maze.length - 1 || sc > maze[0].length - 1 || sr < 0 || sc < 0 || maze[sr][sc] == 1) {
            return;
        }

        if (sr == maze.length - 1 && sc == maze[0].length - 1) {
            System.out.println(asf);
            return;
        }

        maze[sr][sc] = 1;
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            floodFill(maze, r, c, asf + dirN[d]);
        }
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