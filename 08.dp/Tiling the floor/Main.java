import java.io.*;
import java.util.*;

public class Main {
    public static int tiling(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                dp[0] = 1;
                continue;
            }
            int vCall = dp[i - 1];
            int hCall = 0;
            if (i - 2 >= 0) {
                hCall = dp[i - 2];
            }
            dp[i] = vCall + hCall;
        }
        return dp[n];
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(tiling(n));
    }
}