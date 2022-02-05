import java.util.*;

public class main {
    public static Scanner scn = new Scanner(System.in);

    public static void takeInput(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scn.nextInt();
            }
        }

    }

    public static void sm(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        int minr = 0;
        int maxr = n - 1;
        int minc = 0;
        int maxc = m - 1;

        int count = 1;
        int total = n * m;
        while (minr <= maxr && minc <= maxc) {

            for (int i = minr; i <= maxr && count <= total; i++) {
                System.out.println(A[i][minc]);
                count++;

            }
            minc++;

            for (int j = minc; j <= maxc && count <= total; j++) {
                System.out.println(A[maxr][j]);
                count++;
            }
            maxr--;

            for (int i = maxr; i >= minr && count <= total; i--) {
                System.out.println(A[i][maxc]);
                count++;
            }
            maxc--;

            for (int j = maxc; j >= minc && count <= total; j--) {
                System.out.println(A[minr][j]);
                count++;
            }
            minr++;

        }

    }

    public static void main(String[] args) {

        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] A = new int[n1][m1];
        takeInput(A);
        sm(A);
    }
    
}
