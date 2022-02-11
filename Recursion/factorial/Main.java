import java.util.*;

public class Main {

    public static Scanner scn = new Scanner(System.in);

    public static int  factorial(int n) {

        if(n==1)
        {
            return n;
        }

        return n * factorial(n - 1);
        
    }

    public static void main(String[] args) {

        int n = scn.nextInt();
       System.out.println(factorial(n)); 
    
    }
    
}
