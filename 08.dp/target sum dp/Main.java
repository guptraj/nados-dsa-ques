import java.io.*;
import java.util.*;

public class Main {

    public static boolean targetSumR(int idx, int tar, int[] arr) {
        if (tar == 0 || idx == arr.length) {
            if (tar == 0)
                return true;
            return false;
        }

        boolean noCall = targetSumR(idx + 1, tar, arr);
        boolean yesCall = false;
        if (tar - arr[idx] >= 0){
            yesCall = targetSumR(idx + 1, tar - arr[idx], arr);
        }
        return noCall || yesCall;
    }

    public static boolean targetSumT(int[] arr, boolean[][] dp) {
        int n = dp.length;
        int m = dp[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == 0)
                    dp[i][j] = true;
                else if (i == 0)
                    dp[i][j] = false;
                else {
                    boolean noCall = dp[i - 1][j];
                    boolean yesCall = false;
                    if (j - arr[i - 1] >= 0) {
                        yesCall = dp[i - 1][j - arr[i - 1]];
                    }

                    dp[i][j] = noCall || yesCall;
                }
            }
        }

        return dp[n - 1][m - 1];
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        int tar = scn.nextInt();
        // boolean[][] dp = new boolean[n + 1][tar + 1];
        // boolean ans = targetSumT(arr,dp);
        boolean ans = targetSumR(0, tar, arr);
        System.out.println(ans);
    }
}