import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    static String[] input = { ".;", "abc", "def", "ghi", "kjl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getkpc(String s) {
        if (s.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char c = s.charAt(0);
        ArrayList<String> recAns = getkpc(s.substring(1));
        ArrayList<String> myAns = new ArrayList<>();

        int idx = c - '0';
        String ch = input[idx];
        for (int i = 0; i < ch.length(); i++) {
            char newch = ch.charAt(i);
            for (String ele : recAns) {
                myAns.add(newch + ele);
            }
        }

        return myAns;

    }

    public static void main(String[] args) {
        String str = scn.next();
        ArrayList ans = getkpc(str);
        System.out.println(ans);
    }
}


