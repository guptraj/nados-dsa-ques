import java.util.*;

public class Main {
    
    public static int fiboM(int n , int[] dp)
    {
        if (n <= 1) {
            return dp[n] = n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int ans = fiboM(n - 1, dp) + fiboM(n - 2, dp);
        return dp[n] = ans;
    }

    public static int fiboT(int N, int[] dp) {
       
        for (int i = 0; i < dp.length; i++)
        {
            if (n <= 1) {
                dp[n] = n;
                continue;
            }

            int ans = dp[n - 1] + dp[n - 2];
            dp[n] = ans;
        }
        return dp[N];
    }

    public static void main(String[] args )
    {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int [] dp = new int[n+1];
        Arrays.fill(dp, -1);
        int ans = fiboM(n, dp);
        System.out.println(ans);2=?.,M NBV  }
} 