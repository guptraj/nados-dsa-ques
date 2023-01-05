import java.io.*;
import java.util.*;

public class Main{
    static Stack<Character> operator = new Stack<>();
    static Stack<Integer> operant = new Stack<>();
    public static boolean isOprt(char ch){
        if(ch=='+' ||ch=='-' ||ch=='*' ||ch=='/') return true;
        return false;
    }
    public static int precedence(char ch){
        if(ch=='+' ||ch=='-' ) return 0;
        return 1;
    }
    public static void calc(char ch){
        char opr = operator.pop();
        int v2= operant.pop();
        int v1= operant.pop();
        operant.push(calVal(v1,v2,opr));
    }
    public static int calVal(int a,int b ,char ch){
       if(ch=='+') return a+b;
       else if(ch=='-') return a-b;
       else if(ch=='/') return a/b;
       else if(ch=='*') return a*b;
       return -1;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='('){
                operator.push(ch);
            }  
            else if(ch>='0' && ch<='9'){
                operant.push(ch-'0');
            }
            else if(ch==')'){
                while(operator.peek() != '(') {
                    calc();
                }
                operator.pop();
            }
            else if(isOprt(ch)){
                while(operator.size()>0 && operator.peek() != '(' && precedence(ch)<=precedence(operator.peek())){
                    calc();
                }
                operator.push(ch);
            }
        }
        while(operator.size() !=0){
            calc();
        }
        System.out.println(operant.peek());
    }
} 