import java.util.*;

public class rv {

    public static Scanner scn = new Scanner(System.in);

    public static boolean isPrime(int x) {

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void solution(ArrayList<Integer> al) {
        int n = al.size() - 1;
        for (int i = n; i >= 0; i--) {
            if (isPrime(al.get(i))) {
                al.remove(i);
            }
        }
    }

    public static void main(String[] args) {

        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            al.add(scn.nextInt());
        }

        solution(al);

        System.out.println(al);
    }
    
}
