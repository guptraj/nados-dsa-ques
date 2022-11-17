import java.io.*;
import java.util.*;

public class Main {

    public static int zoks(int[] val, int[] wt, int cap) {
        int[][] dp = new int[val.length + 1][cap + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else {
                    int noCall = dp[i - 1][j];
                    int yesCall = 0;
                    if (j - wt[i - 1] >= 0) {
                        yesCall = val[i - 1] + dp[i - 1][j - wt[i - 1]];
                    }
                    dp[i][j] = Math.max(noCall, yesCall);
                }
            }
        }
        return dp[val.length][cap];
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] val = new int[n];
        int[] wt = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            wt[i] = scn.nextInt();
        }
        int cap = scn.nextInt();
        System.out.println(zoks(val, wt, cap));
    }
}