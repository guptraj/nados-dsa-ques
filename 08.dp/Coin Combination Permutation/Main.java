import java.io.*;
import java.util.*;

public class Main {

    public long count(int coins[], int N, int sum) {
        long[] dp = new long[sum + 1];
        dp[0] = 1;
        for (int j = 1; j < dp.length; j++) {
            for (int i = 0; i < coins.length; i++) {
                if (j - coins[i] >= 0) {
                    dp[j] += dp[j - coins[i]];
                }
            }
        }
        return dp[sum];
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] coins = new int [n];
        for(int i=0;i<n;i++)
        {
            coins[i]=scn.nextInt();
        }
        int sum = scn.nextInt();
        System.out.println(count(coins,n,sum);)

    }
}