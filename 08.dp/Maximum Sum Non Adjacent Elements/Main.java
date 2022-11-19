import java.util.*;

public class Main {
    public static int FindMaxSum(int arr[], int n) {
        int[][] dp = new int[2][n];
        dp[0][0] = arr[0];
        dp[1][0] = 0;
        for (int i = 1; i < n; i++) {
            dp[0][i] = arr[i] + dp[1][i - 1];
            dp[1][i] = Math.max(dp[0][i - 1], dp[1][i - 1]);
        }
        return Math.max(dp[0][n - 1], dp[1][n - 1]);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        FindMaxSum(arr, n);
    }
}
