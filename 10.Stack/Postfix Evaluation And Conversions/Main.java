import java.io.*;
import java.util.*;

public class Main{
    static Stack<String> infix = new Stack<>();
    static Stack<String> prefix = new Stack<>();
    static Stack<Integer> eval = new Stack<>();
    public static void infixOp(char ch){
        String v2= infix.pop();
        String v1= infix.pop();
        String ans = "(" + v1 + ch +  v2 +")";
        infix.push(ans);
    }
    public static void prefixOp(char ch){
        String v2= prefix.pop();
        String v1= prefix.pop();
        String ans = ch + v1 + v2 ;
        prefix.push(ans);
    }
    public static void evalOp(char ch){
        int v2= eval.pop();
        int v1= eval.pop();
        int ans = evalCal(v1,v2,ch);
        eval.push(ans);
    }
    public static int evalCal(int a,int b, char ch)
    {
        if(ch=='+') return a+b;
        if(ch=='-') return a-b;
        if(ch=='*') return a*b;
        if(ch=='/') return a/b;
        return -1;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for(int i=0;i<s.length();i++) 
            {
                char ch = s.charAt(i);
                if(ch>='0' && ch<='9'){
                    infix.push(ch+"");
                    prefix.push(ch+"");
                    eval.push(ch-'0');
                }
                else{
                    infixOp(ch);
                    prefixOp(ch);
                    evalOp(ch);
                }
            }
            System.out.println(eval.peek());
            System.out.println(infix.peek());
            System.out.println(prefix.peek());

    }
}