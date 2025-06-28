package StackAndQueue;

import java.util.Stack;

public class PrefixToInfix {
    public static String PostToIn(String s){
        Stack<String> st =new Stack<>();
        for(int i=s.length()-1;i>=0;i--){   //Only difference from postfix is that here we need to read string from right to left
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(ch+"");
            }
            else
            {
                if(st.size()<2){
                    return "invalid expression";
                }
                String a=st.pop();
                String b=st.pop();
                st.push("("+a+ch+b+")");//In postfix it will (b operator a). In prefix it's (a operator b)
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        String s="*+PQ-MN";
        String ans=PostToIn(s);
        if(ans.startsWith("(") && ans.endsWith(")")){
            ans=ans.substring(1,ans.length()-1);
        }
        System.out.println(ans);
    }
}
