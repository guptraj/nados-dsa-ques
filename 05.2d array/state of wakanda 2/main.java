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

    public static void sow2(int[][] A) {

        int n = A.length;

        for (int j = 0; j < n; j++) {
            int x = j;
            int i = 0;

            while (i < n && x < n) {
                System.out.println(A[i][x]);

                i++;
                x++;

            }
        }

    }

    public static void main(String[] args) {

        int n = scn.nextInt();
        int[][] A = new int[n][n];
        takeInput(A);
        sow2(A);

    }

}
