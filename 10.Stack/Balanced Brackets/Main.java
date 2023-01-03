import java.io.*;
import java.util.*;

public class Main {
    public static boolean balancedBrackets(String str){
        Stack <Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='(' || c=='[' || c=='{') st.push(c);
            
            else if (c==')' || c==']' || c=='}'){
                if (st.size() == 0) {
                    return false;
                }
                if (c == '}' && st.peek() != '{')
                    return false;
                else if (c == ')' && st.peek() != '(')
                    return false;
                else if (c == ']' && st.peek() != '[')
                    return false;
                else
                    st.pop();
            }
            
        }
        return st.size()==0;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str= scn.nextLine();
        System.out.println(balancedBrackets(str));
    }

}