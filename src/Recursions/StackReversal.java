package Recursions;

import java.util.Arrays;
import java.util.Stack;

public class StackReversal {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        int i=0;
        while (i!=5){
            s.push(i);
            i++;
        }
        reversal(s);
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    private static void reversal(Stack<Integer> s) {
        if(s.isEmpty())
        {
            return;
        }
        int temp=s.pop();
        reversal(s);
        insertAtbottom(s,temp);
    }

    private static void insertAtbottom(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x);
            return;
        }
        int temp=s.pop();
        insertAtbottom(s,x);
        s.push(temp);
    }
}
