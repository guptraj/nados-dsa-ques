import java.io.*;
import java.util.*;

public class Main {
    public static int friendsPairing(int n, int[] dp) {
        if (n == 0) {
            return dp[n] = 0;
        }
        if (n == 1) {
            return dp[n] = 1;
        }
        if (n == 2) {
            return dp[n] = 2;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int a = friendsPairing(n - 1, dp);
        int b = (n - 1) * friendsPairing(n - 2, dp);
        return dp[n] = a + b;
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(friendsPairing(n, dp));
    }
}