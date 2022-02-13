import java.util.*;

public class Main {

    public static int  gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);  
    }

    public static int lcm(int a, int b) {
        int c = gcd(a, b);

        return (a * b) / c;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        System.out.println(lcm(n1, n2));
    }
}