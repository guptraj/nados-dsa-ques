import java.util.Scanner;

public class main {

    public static Scanner scn = new Scanner(System.in);

    public static void takeInput(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scn.nextInt();
            }
        }

    }

    public static void sow(int[][] a) {
        for (int j = 0; j < a[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < a.length; i++) {
                    System.out.println(a[i][j]);
                }
            } else {
                for (int i = a.length - 1; i >= 0; i--) {
                    System.out.println(a[i][j]);
                }
            }
        }

    }

    public static void main(String[] args) {

        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] A = new int[n1][m1];
        takeInput(A);
        sow(A);

    }

}
