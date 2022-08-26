import java.io.*;
import java.util.*;

public class Main {

    public static int goldmineM(int r, int c, int[][] grid, int[][] dp) {
        if (r < 0 || r >= grid.length || c >= grid[0].length) {
            return 0;
        }

        if (dp[r][c] != 0) {
            return dp[r][c];
        }

        int op1 = goldmineM(r - 1, c + 1, grid, dp);
        int op2 = goldmineM(r, c + 1, grid, dp);
        int op3 = goldmineM(r + 1, c + 1, grid, dp);

        dp[r][c] = Math.max(op1, Math.max(op2, op3)) + grid[r][c];

        return dp[r][c];
    }

    public static int goldmineT(int[][] grid, int[][] dp) {
        for (int j = grid[0].length - 1; j >= 0; j--) {
            for (int i = 0; i < grid.length; i++) {
                if (j == grid[0].length - 1) {
                    dp[i][j] = grid[i][j];
                } else if (i == 0) {
                    int op1 = dp[i][j + 1];
                    int op2 = dp[i + 1][j + 1];

                    dp[i][j] = grid[i][j] + Math.max(op1, op2);
                } else if (i == grid.length - 1) {
                    int op1 = dp[i][j + 1];
                    int op2 = dp[i - 1][j + 1];

                    dp[i][j] = grid[i][j] + Math.max(op1, op2);
                } else {
                    int op1 = dp[i][j + 1];
                    int op2 = dp[i - 1][j + 1];
                    int op3 = dp[i + 1][j + 1];

                    dp[i][j] = grid[i][j] + Math.max(op1, Math.max(op2, op3));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i][0] > ans)
                ans = dp[i][0];
        }

        return ans;
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
        // int ans =0;
        // for(int i =0;i<n;i++)
        // {
        // int temp=goldmineM(i,0,grid,dp);
        // if(temp>ans) ans=temp;
        // }

        System.out.println(goldmineT(grid, dp));

    }
}