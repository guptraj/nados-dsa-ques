import java.util.*;

public class Main {

    public static void zigZag(int n) {

        if (n == 0) {
            
            return;
        }                                       //1

        System.out.print(n + " ");                  //2
        zigZag(n - 1);                          //3
        System.out.print(n + " ");                  //4
        zigZag(n - 1);                          //5
        System.out.print(n + " ");                  //6

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        zigZag(n);

    }

}
