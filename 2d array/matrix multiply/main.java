import java.util.Scanner;

public class main {

    public static Scanner scn = new Scanner(System.in);

    public static void display(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void takeInput(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scn.nextInt();
            }
        }

    }

    public static int[][] mm(int[][] A, int[][] B) {
        int n1 = A.length;
        int m1 = A[0].length;
        int m2 = B[0].length;
        int[][] c = new int[n1][m2];

        for (int i = 0; i < n1; i++) {

            for (int j = 0; j < m2; j++) {
                int sum = 0;
                for (int k = 0; k < m1; k++) {
                    sum += A[i][k] * B[k][j];

                }
                c[i][j] = sum;

            }
        }

        return c;

    }

    public static void main(String[] args) {

        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] A = new int[n1][m1];
        takeInput(A);

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] B = new int[n2][m2];
        takeInput(B);

        if (m1 != n2) {
            System.out.println("Invalid input");
        } else {
            int[][] C = mm(A, B);
            display(C);
        }

    }
}
