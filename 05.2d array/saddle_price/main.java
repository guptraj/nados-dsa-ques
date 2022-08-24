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

    public static void saddlepoint(int[][] A) {

        for (int i = 0; i < A.length; i++) {

            int maxinrow = Integer.MIN_VALUE;
            int r, c;

            for (int j = 0; j < A.length; j++) {

                if (A[i][j] > maxinrow) {
                    maxinrow = A[i][j];
                    r = i;
                    c = j;
                }
            }

            for (int j = 0; j < A.length; j++) {

                if (A[j][c] > A[r][c]) {

                }
            }
        }

    }

    public static void main(String[] args) {

        int n = scn.nextInt();
        int[][] A = new int[n][n];
        takeInput(A);
        saddlepoint(A);

    }

}
