package StackAndQueue;

import java.util.Stack;

public class PostfixToInfix {
    public static String PostToIn(String s){
        Stack<String>st =new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(ch+"");
            }
            if(!Character.isLetterOrDigit(ch))
            {
                if(st.size()<2){
                    return "invalid expression";
                }
                String a=st.pop();
                String b=st.pop();
                st.push("("+b+ch+a+")");
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        String s="AB-DE+F*/";

        String ans=PostToIn(s);
        if(ans.startsWith("(") && ans.endsWith(")")){
            ans=ans.substring(1,ans.length()-1);
        }
        System.out.println(ans);
    }
}
