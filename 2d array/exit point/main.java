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

    public static void ep(int[][] A) {
        int dir = 0;

        int i = 0;
        int j = 0;
        int n = A.length;
        int m = A[0].length;

        while (i >= 0 && j >= 0 && j < m && i < n) {
            dir += A[i][j];
            dir %= 4;

            if (dir == 0) {
                j++;
            }

            else if (dir == 1) {
                i++;
            }

            else if (dir == 2) {
                j--;
            }

            else if (dir == 3) {
                i--;
            }

        }

        if (i < 0) {
            i++;
        } else if (i >= n) {
            i--;
        } else if (j >= m) {
            j--;
        } else if (j < 0) {
            j++;
        }

        System.out.println(i);
        System.out.println(j);

    }

    public static void main(String[] args) {

        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] A = new int[n1][m1];
        takeInput(A);
        ep(A);

    }

}
