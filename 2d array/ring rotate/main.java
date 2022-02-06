import java.util.*;

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

    public static void reverse(int[] a, int i, int e) {
        
        while(i<=e)
        {
            int temp = a[i];
            a[i] = a[e];
            a[e] = temp;
            i++;
            e--;
        }
        
    }
    
    public static int[] from2Dto1D(int[][] a, int s) {
        
        int maxr = a.length - s;
        int minr = s - 1;

        int maxc = a[0].length - s;
        int minc = s - 1;

        int size = 2 * (maxr - minr + maxc - minc);
        int[] d = new int[size];
        
        int idx = 0;

        for (int i = minr; i <= maxr;i++)
        {
            d[idx] = a[i][minc];
            idx++;
        }
        minc++;

        for (int j = minc; j <= maxc;j++)
        {
            d[idx] = a[maxr][j];
            idx++;
        }
        maxr--;

        for (int i = maxr; i >= minr;i--)
        {
            d[idx] = a[i][maxc];
            idx++;
        }
        maxc--;

        for (int j = maxc; j >= minc;j--)
        {
            d[idx] = a[minr][j];
            idx++;
        }

        return d;

    }
    
    public static void rotate1D(int[] a, int k) {
        int size=a.length;
        
        if(k>=0)
        {
            k %= size;
        }
        else
        {
            k %= size;
            k += size;
        }

        reverse(a,0,size-1-k);
        reverse(a,size-k,size-1);
        reverse(a,0,size-1);

    }

    public static void from1Dto2D(int[] d, int[][] a,int s) {
        int maxr = a.length - s;
        int minr = s - 1;

        int maxc = a[0].length - s;
        int minc = s - 1;

        int idx = 0;

        for (int i = minr; i <= maxr; i++) {
         a[i][minc]=d[idx];
            idx++;
        }
        minc++;

        for (int j = minc; j <= maxc; j++) {
             a[maxr][j]=d[idx];
            idx++;
        }
        maxr--;

        for (int i = maxr; i >= minr; i--) {
             a[i][maxc] = d[idx];
            idx++;
        }
        maxc--;

        for (int j = maxc; j >= minc; j--) {
             a[minr][j]=d[idx];
            idx++;
        }

        
        
    }

    public static void rr(int [][] a,int s,int r) {
        //  3 steps approach 
        // 1. from 2d to 1d
        // 2. rotate 1d
        // 3. from 1d to 2d

        int[] D = from2Dto1D(a, s);
        rotate1D(D, r);
        from1Dto2D(D, a,s);
        
    }
    public static void main(String[] args) {

        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] A = new int[n][m];
        takeInput(A);
        int s = scn.nextInt();
        int r = scn.nextInt();
        rr(A,s,r);
        display(A);

    }

    
}
