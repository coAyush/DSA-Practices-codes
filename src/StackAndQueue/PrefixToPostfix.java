package StackAndQueue;

import java.util.Stack;

public class PrefixToPostfix {
    public  static String preToPost(String s){
        Stack<String> st=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
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
                st.push(a+b+ch);
            }
        }
        return st.pop();

    }
    public static void main(String[] args) {
        String s="/-AB*+DEF";
        System.out.println(preToPost(s));
    }
}
