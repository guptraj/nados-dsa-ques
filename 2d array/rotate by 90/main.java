package rotate by 90;

public class main {
    public static Scanner scn = new Scanner(System.in);

    public static void display(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");

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

    public static void reverse(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            int x = 0;
            int y = a[0].length - 1;
            while (x < y) {
                int temp = a[i][x];
                a[i][x] = a[i][y];
                a[i][y] = temp;
                x++;
                y--;

            }
        }

    }

    public static void rbn(int[][] a) {

        int n = a.length;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                if (i > j) {
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {

        int n1 = scn.nextInt();
        int[][] A = new int[n1][n1];
        takeInput(A);
        rbn(A);
        reverse(A);
        display(A);

    }
    
}
