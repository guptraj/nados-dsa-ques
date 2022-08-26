import java.io.*;
import java.util.*;

public class Main {

    public static int goldmine(int r, int c, int[][] grid, int[][] dp) {
        if (r < 0 || r >= grid.length || c >= grid[0].length) {
            return 0;
        }

        if (dp[r][c] != 0) {
            return dp[r][c];
        }

        int op1 = goldmine(r - 1, c + 1, grid, dp);
        int op2 = goldmine(r, c + 1, grid, dp);
        int op3 = goldmine(r + 1, c + 1, grid, dp);

        dp[r][c] = Math.max(op1, Math.max(op2, op3)) + grid[r][c];

        return dp[r][c];
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = scn.nextInt();
            }
        }

        int[][] dp = new int[n][m];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int temp = goldmine(i, 0, grid, dp);
            if (temp > ans)
                ans = temp;
        }

        System.out.println(ans);

    }
}