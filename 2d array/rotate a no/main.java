import java.util.*;

public class main {
    public static Scanner scn = new Scanner(System.in);

    public static int countOfDigits(int num) {
        int count=0;

        while(num!=0)
        {
            num/=10;
            count++;

        }

        return count;
        
    }
    public static int rotateANumber(int num, int r) {

        int ln=countOfDigits(num);

        int a= num / (int)Math.pow(10,r);
        int b=num % (int)Math.pow(10,r);

        return (b* (int)Math.pow(10, ln-r) + a) ;
        
    }
    public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int k=scn.nextInt();

        System.out.println(rotateANumber(n, k)); 
        
    }
    
}
