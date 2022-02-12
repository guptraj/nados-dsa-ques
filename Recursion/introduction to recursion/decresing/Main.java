import java.util.*;

public class Main {

    public static Scanner scn = new Scanner(System.in);

    public static void printDec(int n)
    {
        if(n==0)
        {
            return;
        }

        System.out.println(n);
        printDec(n-1);
    }

    public static void main(String[] args) {

        int n = scn.nextInt();

        printDec(n);
        
    }
    
}
