import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printEncodings(str, "");
    }

    public static void printEncodings(String s , String ans ) {

        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        }

        if(s.charAt(0)==0)
        {
            return;
        }

        char ch = s.charAt(0);
        int v1 = ch - '0';

        printEncodings(s.substring(1), ans +(char)(v1 + 'a' -1) );
        
       if(s.length()>1)
       {
           char ch2 = s.charAt(1);
           int v2 = ch2 - '0';
           int num = v1 * 10 + v2;
           if(num<=26)
           {
               printEncodings(s.substring(2), ans +(char)(num+'a'-1));
           }
       }
       



    }
    
}
