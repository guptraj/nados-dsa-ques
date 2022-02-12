import java.util.Scanner;

public class Main {

    public static Scanner scn = new Scanner(System.in);

    public static void takeInput(int [] a, int idx)
    {
        if (idx == a.length)
        {
            return;
        }
        a[idx] = scn.nextInt();
        takeInput(a, idx+1);
    }

    public static void display(int []a, int idx)
    {
        if (idx == a.length) {
            return;
        }
        System.out.println(a[idx]);
        display(a, idx+1 );
    }

    public static void main(String [] args)
    {
        int n = scn.nextInt();
        int[] a = new int[n];
        takeInput(a,0);
        display(a,0);

    }
    
}
