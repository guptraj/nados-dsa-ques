import java.io.*;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        HashMap<Integer, Integer> hm = new HashMap<>();

        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
            hm.put(arr1[i], hm.getOrDefault(arr1[i], 0) + 1);
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }

        for (int ele : arr2) {
            if (hm.containsKey(ele) && hm.get(ele) > 0) {
                System.out.println(ele);
                hm.put(ele, hm.get(ele) - 1);
            }
        }

    }

}