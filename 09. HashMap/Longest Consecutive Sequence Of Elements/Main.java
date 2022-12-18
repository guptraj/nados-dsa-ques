import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] arr = new int [n];
        HashMap <Integer,Boolean> hm = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
            hm.put(arr[i],true);
        }

        for(int ele : arr){
            if(hm.containsKey(ele-1)){
                hm.put(ele,false);
            }
        }
        int maxlen=0;
        int strpt=0;
        for(int ele : arr)
        {
            if(hm.get(ele)==true){
                int templen =1;
                int tempstr=ele;
                while(hm.containsKey(tempstr+templen)){
                    templen++;
                }
                if(maxlen<templen)
                {
                    maxlen=templen;
                    strpt=ele;
                }
            }
        }
        for(int i=strpt;i<=maxlen;i++)
        {
            System.out.println(i);
        }
    }

}