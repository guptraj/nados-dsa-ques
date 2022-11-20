public class Main {
    public static long mod = (long) 1e9 + 7;

    public static long countWays(int n, int k) {
        long[][] dp = new long[2][n + 1];
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[0][1] = 0;
                dp[1][1] = k;
                continue;
            }
            if (i == 2) {
                dp[0][2] = k;
                dp[1][2] = k * (k - 1);
                continue;
            }
            dp[0][i] = (dp[1][i - 1]) % mod;
            dp[1][i] = ((k - 1) * (dp[1][i - 1] + dp[0][i - 1])) % mod;
        }
        return (dp[0][n] + dp[1][n]) % mod;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        System.out.println(countWays(n, k));
    }
}
