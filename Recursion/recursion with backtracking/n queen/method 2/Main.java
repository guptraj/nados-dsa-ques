import java.util.*;

public class Main {

    // N QUEEN USING DIRECTIONAL ARRAY

    static int[][] dir = { { -1, -1 }, { -1, 0 }, { -1, 1 } };

    public static boolean isSafe(int[][] chess, int r, int c) {
        for (int d = 0; d < dir.length; d++) {
      
            for (int jump = 1; jump <= r; jump++) {
                int row = r +(jump * dir[d][0]);
                int col = c + (jump * dir[d][1]);

                if (row < chess.length && row >= 0 && col >= 0 && col < chess.length)
                {
                    if (chess[row][col] == 1) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void printNQueens(int[][] chess, String asf, int row) {
        
        if ( row == chess.length)
        {
            System.out.println(asf + ".");
            return;
        }

        for (int col = 0; col < chess[0].length; col++) {
            if (isSafe(chess, row, col)) {
                chess[row][col] = 1;
                printNQueens(chess, asf + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] chess = new int[n][n];
        printNQueens(chess, "", 0);
    }

}
