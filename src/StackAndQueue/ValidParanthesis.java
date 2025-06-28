package StackAndQueue;
import java.util.Stack;
public class ValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        char [] c=s.toCharArray();
        for(char ch:c){
            if(ch=='(' || ch=='{'|| ch=='['){
                st.push(ch);
            }
            else{
                if(ch==')'){
                    if(st.isEmpty()|| st.pop()!='('){
                        return false;
                    }
                }
                if(ch=='}'){
                    if(st.isEmpty()|| st.pop()!='{'){
                        return false;
                    }
                }
                if(ch==']'){
                    if(st.isEmpty()|| st.pop()!='['){
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
     ValidParanthesis valid=new ValidParanthesis();
     String s="]";
        System.out.println(valid.isValid(s));
    }
}