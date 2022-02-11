import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void printInc(int n) {
        if (n == 0) {
            return;
        }

        printInc(n - 1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        int n = scn.nextInt();

        printInc(n);
    }

}
