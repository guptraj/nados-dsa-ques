import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"
        Stack <Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++) st.push(i);
        while(st.size()>=2){
            int j= st.pop();
            int i= st.pop();
            if(arr[i][j]==1) st.push(j);
            else st.push(i);
        }
        int i=st.peek();
        boolean flag=true;
        for(int j=0;j<n;j++){
            if(arr[i][j]==1){ flag=false;
                break;
            }
            if(arr[j][i]==0) {flag=false;
                break;
            }
        }
        if(flag==true) System.out.println(i);
        else System.out.println("none");
    }

}