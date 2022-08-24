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

    public static int[] allIndices(int[] a, int x, int idx, int count) {

        if (idx == a.length) {
            int[] ans = new int[count];
            return ans;
        }

        if (a[idx] == x) {
            count++;
        }

        int[] recAns = allIndices(a, x, idx + 1, count);

        if (a[idx] == x) {
            recAns[count - 1] = idx;
        }

        return recAns;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] a = new int[n];
        takeInput(a, 0);
        int x = scn.nextInt();

        int[] ans = allIndices(a, x, 0, 0);

        for (int ele : ans) {
            System.out.println(ele);
        }

    }

}
