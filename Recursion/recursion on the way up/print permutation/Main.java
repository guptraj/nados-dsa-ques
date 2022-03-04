import java.util.*;

public class Main {

    public static void printPermutations(String s, String asf) {

        if (s.length() == 0) {
            System.out.println(asf);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String ros = s.substring(0, i) + s.substring(i + 1);
            printPermutations(ros, asf + ch);
        }

    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPermutations(str, "");

    }

}