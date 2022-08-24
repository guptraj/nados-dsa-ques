import java.util.Scanner;

public class main {
    public static Scanner scn = new Scanner(System.in);

    public static void takeinput(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

    }

    public static int maxElement(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        return maxi;
    }

    public static void bargraph(int[] arr) {
        int n = maxElement(arr);

        for (int h = n; h > 0; h--) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= h) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = scn.nextInt();

        int[] arr = new int[n];

        takeinput(arr);
        bargraph(arr);
    }
}
