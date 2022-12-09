import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.chatAt(i);
            if (hm.containsKey(c)) {
                int val = hm.get(c);
                hm.put(c, val + 1);
            } else {
                hm.put(c, 1);
            }
        }
        char max = s.charAt(0);
        for (Character key : hm.keySet()) {
            if (hm.get(key) > hm.get(max)) {
                max = key;
            }
        }
        System.out.println(max);

    }

}