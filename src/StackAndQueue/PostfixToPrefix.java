package StackAndQueue;

import java.util.Stack;

public class PostfixToPrefix {
    public static String postToPre(String s){
        Stack<String>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
                st.push(ch+"");
            else if(st.size()<2)
            {
                return "Invalid expression";
            }
            else{
                String a=st.pop();
                String b=st.pop();
                st.push(ch+b+a);
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        String s="AB-DE+F*/";
        System.out.println(postToPre(s));
    }
}
