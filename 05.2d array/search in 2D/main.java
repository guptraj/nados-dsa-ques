import java.util.Scanner;

public class main {
    public static Scanner scn = new Scanner(System.in);

    public static void takeInput(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = scn.nextInt();
            }
        }

    }

    public static void search(int[][] a, int x) {
        int n = a.length;

        int i = 0;
        int j = a[0].length - 1;

        while (i < n && j >= 0) {
            if (a[i][j] == x) {
                System.out.println(i);
                System.out.println(j);

                return;

            } else if (a[i][j] < x) {
                i++;

            } else {
                j--;
            }
        }

        System.out.println("Not Found");

    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[][] A = new int[n][n];
        takeInput(A);
        int x = scn.nextInt();
        search(A, x);
    }

}
