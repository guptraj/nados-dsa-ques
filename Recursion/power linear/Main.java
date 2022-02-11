import java.util.*;

public class Main {

    public static Scanner scn = new Scanner(System.in);

    public static int powerLinear(int n, int x) {
        
        if(x==1)
        {
            return n;
        }

        return n * powerLinear(n, x - 1);
        
    }

    public static void main(String[] args) {
        
        int n = scn.nextInt();
        int x = scn.nextInt();

        System.out.println(powerLinear(n, x)); 

        
    }
    
}
