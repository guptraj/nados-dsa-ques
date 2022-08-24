import java.util.*;

public class Main {

    public static Scanner scn = new Scanner(System.in);

    public static ArrayList<String> mazePath(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();

        if (sc + 1 <= dc) {
            ArrayList<String> vc = mazePath(sr, sc + 1, dr, dc);
            for (String ele : vc) {
                myAns.add("h" + ele);
            }
        }

        if (sr + 1 <= dr) {
            ArrayList<String> hc = mazePath(sr + 1, sc, dr, dc);
            for (String ele : hc) {
                myAns.add("v" + ele);
            }
        }

        return myAns;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(mazePath(0, 0, n - 1, m - 1));
    }
}
