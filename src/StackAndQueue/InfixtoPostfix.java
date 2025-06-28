package StackAndQueue;

import java.util.Stack;

public class InfixtoPostfix {
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
    public static void main(String[] args) {
        String s="a+b*(c^d-e)";
        System.out.println(IntoPost(s));
    }
}
