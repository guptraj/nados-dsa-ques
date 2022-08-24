import java.util.*;

public class Main
{
    public static Scanner scn = new Scanner(System.in);

    public static ArrayList<String> gss(String s)
    {

        if(s.length()==0)
        {
            ArrayList<String> Ans = new ArrayList<>();
            Ans.add(" ");
            return Ans;
        }
     
        char c = s.charAt(0);
        ArrayList<String> Recans = gss(s.substring(1));
        ArrayList<String> MyAns = new ArrayList<>();
       
        for (String ele : Recans)
        {
            MyAns.add (ele);
        }

        for (String ele : Recans)
        {
            MyAns.add(c + ele);
        }



        return MyAns;
    }
    public static void main(String [] args)
    {
        String s = scn.nextLine();
        ArrayList<String> ans = gss(s);
        System.out.println(ans);
    }
}