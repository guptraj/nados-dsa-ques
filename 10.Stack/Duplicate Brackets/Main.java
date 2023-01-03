import java.io.*;
import java.util.*;

public class Main {
    public static boolean duplicateBrackets(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            if(c!=')') st.push(c);
            else{
                if(st.peek()=='(') return true;
                while(st.peek() != '(') st.pop();
                st.pop();
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        String str = scn.nextLine();
        System.out.println(duplicateBrackets(str));
    }

}