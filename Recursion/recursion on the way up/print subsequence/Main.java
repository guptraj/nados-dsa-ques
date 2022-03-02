import java.util.Scanner;

public class Main {

    

    public static void printss(String str, String ans) {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }

        char c = str.charAt(0);
        printss(str.substring(1),c+ ans);
        printss(str.substring(1), ans);

    }

    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        printss(s, "");
    }
    
}
