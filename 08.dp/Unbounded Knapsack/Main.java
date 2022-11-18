import java.io.*;
import java.util.*;

public class Main {

    public static int unboundedKnapsack(int[] val, int[] wt, int cap) {
        int[] dp = new int[cap + 1];
        dp[0] = 0;
        for (int i = 0; i < dp.length; i++) {
            int max = 0;
            for (int j = 0; j < wt.length; j++) {
                if (i - wt[j] >= 0) {
                    int temp = val[j] + dp[i - wt[j]];
                    if (temp > max) {
                        max = temp;
                    }
                }
            }
            dp[i] = max;
        }
        return dp[cap];
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
        System.out.println(unboundedKnapsack(val, wt, cap));
    }
}