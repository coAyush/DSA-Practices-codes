package StackAndQueue;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String s = "(p+q)*(m-n)";

        // Reverse the expression
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        s = sb.toString();

        // Swap brackets
        s = s.replace('(', '#').replace(')', '(').replace('#', ')');

        // Convert to postfix
        String ans = IntoPost(s);

        // Reverse postfix to get prefix
         sb = new StringBuilder(ans);
        sb.reverse();
        ans = sb.toString();

        System.out.println(ans);
    }

    public static String IntoPost(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                ans.append(ch);
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                if(!st.isEmpty() && st.peek()=='(')
                    st.pop();
            } else {
                while (!st.isEmpty() && priority(ch) <= priority(st.peek()) && ch != '^') {
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();
    }

    private static int priority(char c) {
        if (c == '^') return 3;
        else if (c == '*' || c == '/') return 2;
        else if (c == '+' || c == '-') return 1;
        return -1;
    }
}
