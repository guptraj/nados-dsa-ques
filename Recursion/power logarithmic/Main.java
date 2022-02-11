import java.util.*;

public class Main {

    public static int powerLog(int x, int n) {

        if (n == 0) {
            return 1;
        }

        int ans = 0;

        if (n % 2 == 0) {
            int z = powerLog(x, n / 2);
            ans = z * z;
        }

        else {
            int z = powerLog(x, n / 2);
            ans = z * z * x;
        }

        return ans;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int n = scn.nextInt();

        System.out.println(powerLog(x, n));

    }

}
