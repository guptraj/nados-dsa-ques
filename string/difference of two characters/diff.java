import java.util.*;
import java.util.Scanner;

public class diff {
    public static Scanner scn = new Scanner(System.in);

    public static String df(String s)
    {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length()-1;i++ )
        {
            char c = s.charAt(i);
            char f = s.charAt(i + 1);
            int diff = f-c;

            ans.append(s.charAt(i));
            ans.append(diff);

        }
        ans.append(s.charAt(s.length()-1));
        
        return ans.toString();

    }

    public static void main(String[] args) {

        String s = new String();
        s = scn.nextLine();
        System.out.println(df(s)); 

        
    }
    
}
