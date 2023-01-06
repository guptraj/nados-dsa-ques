import java.io.*;
import java.util.*;

public class Main{
    static Stack <Integer> eval = new Stack<>();
    static Stack <String> postfix = new Stack<>();
    static Stack <String> infix = new Stack<>();
    public static void evalOp(char ch){
        int v1=eval.pop();
        int v2=eval.pop();
        eval.push(evalCal(v1,v2,ch));
    }
    public static int evalCal(itn a,int b,char ch){
        if(ch=='+') return a+b;
        if(ch=='-') return a-b;
        if(ch=='*') return a*b;
        if(ch=='/') return a/b;
        return -1;
    }
    public static void infixOp(char ch){
        String v1= infix.pop();
        String v2= infix.pop();
        String ans = "(" + v1 + ch +  v2 +")";
        infix.push(ans);
    }
    public static void postfixOp(char ch){
        String v1= postfix.pop();
        String v2= postfix.pop();
        String ans= v1+v2+ch;
        postfix.push(ans);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for(int i = s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9'){
                eval.push(ch-'0');
                infix.push(ch+"");
                postfix.push(ch+"");
            }
            else{
                evalOp(ch);
                postfixOp(ch);
                infixOp(ch);
            } 
        }
        System.out.println(eval.peek());
        System.out.println(infix.peek());
        System.out.println(postfix.peek());
        
    }
}