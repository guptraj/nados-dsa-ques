import java.io.*;
import java.util.*;

public class Main {

    public static Scanner scn = new Scanner(System.in);

    public static void takeInput(int[] a, int idx) {
        if (idx == a.length) {
            return;
        }
        a[idx] = scn.nextInt();
        takeInput(a, idx + 1);
    }

    public static int firstIndex(int[] arr, int idx, int x) {

        if (idx == a.length)
        {
            return -1;
        }

        if (arr[idx] == x) {
            
            return idx;
        }

        int ans = firstIndex(arr, idx + 1, x);

        return ans ;

    }

    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int[] a = new int[n];
        takeInput(a, 0);
        int x = scn.nextInt();
       System.out.println(firstIndex(a, 0, x)); 

    }

    

}