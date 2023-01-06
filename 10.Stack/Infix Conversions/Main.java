import java.io.*;
import java.util.*;

public class Main{
    public static int precedence(char ch){
        if(ch=='*' || ch=='/') return 1;
        return 0;
    }
    public static boolean isOpr(char ch){
        if(ch=='*' || ch=='/' || ch=='+' || ch=='-') return true;
        return false;
    }
    
   public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack<String> postfix = new Stack <>();
        Stack<String> prefix = new Stack <>();
        Stack<Character> optr = new Stack <>();
        for(int i =0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch=='(') optr.push(ch);
            else if(ch>='0' && ch<='9' ||ch>='A' && ch<='Z' ||ch>='a' && ch<='z'){ 
                prefix.push(ch+"");
                postfix.push(ch+"");
                
            }
            else if(ch==')'){
                while(optr.peek()!='('){
                    char opr = optr.pop();
                    String  postv2 =  postfix.pop();
                    String  postv1 =  postfix.pop();
                    String postans =  postv1+postv2+opr;
                    postfix.push(postans);
                    
                    String  prev2 =  prefix.pop();
                    String  prev1 =  prefix.pop();
                    String preans =  opr+prev1+prev2;
                    prefix.push(preans);
                    
                }
                optr.pop();
            }
            else if(isOpr(ch)){
                while(optr.size()>0 && optr.peek()!='(' && precedence(ch)<=precedence(optr.peek())){
                    char opr = optr.pop();
                    String  postv2 =  postfix.pop();
                    String  postv1 =  postfix.pop();
                    String postans =  postv1+postv2+opr;
                    postfix.push(postans);
                    
                    String  prev2 =  prefix.pop();
                    String  prev1 =  prefix.pop();
                    String preans =  opr+prev1+prev2;
                    prefix.push(preans);
                }
                optr.push(ch);
            }
        }
        while(optr.size() > 0){
            char opr = optr.pop();
                    String  postv2 =  postfix.pop();
                    String  postv1 =  postfix.pop();
                    String postans =  postv1+postv2+opr;
                    postfix.push(postans);
                    
                    String  prev2 =  prefix.pop();
                    String  prev1 =  prefix.pop();
                    String preans =  opr+prev1+prev2;
                    prefix.push(preans);
        }
        System.out.println(postfix.peek());
        System.out.println(prefix.peek());
    }
}