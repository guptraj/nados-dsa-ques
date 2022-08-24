import java.util.*;

public class tc {

    public static Scanner scn = new Scanner(System.in);

    public static String toggleCase(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                char lc = (char)(ch - 'A' + 'a');
                sb.append(lc);
            }

            else {
                char uc= (char) (ch - 'a' + 'A');
                sb.append(uc);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = new String();
        s = scn.nextLine();
        System.out.println(toggleCase(s));
    }

}
 