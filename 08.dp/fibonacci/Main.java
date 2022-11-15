import java.util.*;

public class Main {
    public static int fiboM(int n, int[] dp) {
        if (n == 0 || n == 1)
            return dp[n] = n;
        if (dp[n] != -1)
            return dp[n];
        dp[n - 1] = fiboM(n - 1, dp);
        dp[n - 2] = fiboM(n - 2, dp);
        return dp[n - 1] + dp[n - 2];
    }

    public static int fiboT(int N, int[] dp) {

        for (int n = 0; n < dp.length; n++) {
            if (n == 0 || n == 1) {
                dp[n] = n;
                continue;
            }

            dp[n] = dp[n - 1] + dp[n - 2];
        }
        return dp[N];
    }

    public int fib(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        // dp[n] = fiboM(n, dp);
        itna ns fiboT(n, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = fib(n);
        System.out.println(ans);
    }
}
