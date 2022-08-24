import java.util.*;

public class Main {

    public static ArrayList<String> mazePath(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();

        for (int i = 1; sc + i <= dc; i++) {

            ArrayList<String> hc = mazePath(sr, sc + i, dr, dc);
            for (String ele : hc) {
                myAns.add("h" + i + ele);
            }
        }

        for (int i = 1; sr + i <= dr; i++) {

            ArrayList<String> vc = mazePath(sr + i, sc, dr, dc);
            for (String ele : vc) {
                myAns.add("v" + i + ele);
            }
        }

        for (int i = 1; sc + i <= dc && sr + i <= dr; i++) {

            ArrayList<String> dgc = mazePath(sr + i, sc + i, dr, dc);
            for (String ele : dgc) {
                myAns.add("d" + i + ele);
            }
        }

        return myAns;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(mazePath(0, 0, n - 1, m - 1));

    }

}
