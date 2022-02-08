import java.util.*;

public class sc {
    public static Scanner scn = new Scanner(System.in);

    public static String compression1(String s) {
        int c = 0;
        String ans = "" + s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(c)) {
                ans += s.charAt(i);
                c = i;
            }

            else {
                c = i;
            }

        }

        return ans;
    }

    public static String compression2(String s) {

        String ans = "" + s.charAt(0);
        int pr = 0;
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(pr)) {
                count++;
                pr = i;
            } else {
                if (count > 1) {
                    ans += count;
                }

                ans += s.charAt(i);
                count = 1;
                pr = i;
            }
        }
        
        if(count>1)
        {
            ans += count;
        }

        return ans;

    }

    public static void main(String[] args) {

        String s = scn.next();

        System.out.println(compression1(s));
        System.out.println(compression2(s));

    }

}
