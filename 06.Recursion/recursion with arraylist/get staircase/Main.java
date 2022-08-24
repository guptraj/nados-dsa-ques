import java.util.ArrayList;
import java.util.Scanner;

import org.ietf.jgss.GSSContext;

public class Main {

    public static Scanner scn = new Scanner(System.in);

    public static ArrayList<String> gtc(int n)
    {
        if(n==0)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> Myans = new ArrayList<>();
        if(n-1>=0)
        {
            ArrayList<String> nm1 = gtc(n - 1);
            for(String ele:nm1)
            {
                Myans.add("1" + ele);
            }
 
        }
        if(n-2>=0)
        {
            ArrayList<String> nm2 = gtc(n - 2);
            for (String ele : nm2) {
                Myans.add("2" + ele);
            }
            
        }
        if(n-3>=0)
        {
            ArrayList<String> nm3 = gtc(n - 3);
            for (String ele : nm3) {
                Myans.add("3" + ele);
            }

        }
        
        return Myans;



    }
    public static void main(String [] args )
    {
        int n = scn.nextInt();
        ArrayList<String> ans = gtc(n);
        System.out.println(ans);

    }
    
}
