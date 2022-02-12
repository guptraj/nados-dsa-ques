import java.util.*;

public class Main {

    public static Scanner scn = new Scanner(System.in);

    public static void towerOfHanoi(int n, int x, int y, int z) {

        if (n == 0) {
            return;
        }

        towerOfHanoi(n - 1, x, z, y);
        System.out.println(n + "[" + x + " -> " + y + "]");
        towerOfHanoi(n-1, z, y, x);

       
    }

    public static void main(String[] args) {

        int n = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        towerOfHanoi(n, n1, n2, n3);

    }

}
