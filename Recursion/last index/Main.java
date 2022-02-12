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

    public static int lastIndex(int[] arr, int idx, int x) {

        if (idx < 0) {
            return -1;
        }

        if (arr[idx] == x) {
            return idx;
        }

        int ans = lastIndex(arr, idx - 1, x);
        return ans;

    }

    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int[] a = new int[n];
        takeInput(a, 0);
        int x = scn.nextInt();
        System.out.println(lastIndex(a, a.length - 1, x));

    }

}
