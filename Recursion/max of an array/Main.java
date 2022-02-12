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

    public static int maxOfArray(int[] arr, int idx) {

        if (idx == arr.length-1)
        {
            return arr[idx];
        }

        int ans = Math.max(arr[idx], maxOfArray(arr, idx + 1));
        return ans;
    }

    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int[] a = new int[n];
        takeInput(a, 0);
       System.out.println(maxOfArray(a, 0)); 
    }

}
