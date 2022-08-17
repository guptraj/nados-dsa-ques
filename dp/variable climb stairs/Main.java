import java.io.*;
import java.util.*;

public class Main {

    public static int climbStairsVR(int sr, int dt, int[] steps) {
        if (sr == dt) {
            return 1;
        }

        int count = 0;
        for (int i = 1; i <= steps[sr] && sr + i <= dt; i++) {
            count += climbStairsVR(sr + i, dt, steps);
        }

        return count;
    }

    public static int climbStairsVM(int sr, int dt, int[] steps, int[] dp) {
        if (sr == dt) {
            return dp[sr] = 1;
        }

        if (dp[sr] != -1) {
            return dp[sr];
        }

        int count = 0;
        for (int i = 1; i <= steps[sr] && sr + i <= dt; i++) {
            count += climbStairsVR(sr + i, dt, steps);
        }

        return dp[sr] = count;
    }

    public static int climbStairsVT(int SR, int dt, int[] steps, int[] dp) {
        for (int sr = dp.length - 1; sr >= 0; sr--) {
            if (sr == dt) {
                dp[sr] = 1;
                continue;
            }

            int count = 0;

            for (int i = 1; i <= steps[sr] && sr + i <= dt; i++) {
                count += dp[sr + i];
            }

            dp[sr] = count;
        }
        return dp[SR];

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] steps = new int[n];
        for (int i = 0; i < n; i++) {
            steps[i] = scn.nextInt();
        }
        int[] dp = new int[n + 1];
        for (int var : dp) {
            dp[var] = -1;
        }
        // int ans = climbStairsVR(0,n,steps);
        // int ans =climbStairsVM(0,n,steps,dp);
        int ans = climbStairsVT(0, n, steps, dp);
        System.out.println(ans);
    }

}