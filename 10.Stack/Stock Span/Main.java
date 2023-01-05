import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] span = solve(a);
    display(span);
 }

 public static void nextLeft(int[]ngol,int [] arr){
     Stack<Integer> st= new Stack<>();
     for(int i=arr.length-1;i>=0;i--){
         while(st.size()!=0 && arr[st.peek()]<arr[i]){
            ngol[st.pop()]=i;
         }
         st.push(i);
     }
 }   
 public static int[] solve(int[] arr){
   int n = arr.length;
   int [] ans = new int [n];
   int [] ngol= new int [n];
   Arrays.fill(ngol,-1);
   nextLeft(ngol,arr);
   for(int i=0;i<n;i++){
       ans[i]=i-ngol[i];
   }
   return ans;
 }

}