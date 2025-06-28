package StackAndQueue;
import java.util.Stack;

public class ExpressionCount {
    public static int moves(String s) {
        char[] c = s.toCharArray();
        Stack<Character> st = new Stack<>();
        int v = 0;

        for (int i = 0; i < c.length; i++) {
            char ch = c[i];

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (!st.isEmpty()) {
                    char top = st.peek();
                    if ((ch == ')' && top == '(') ||
                            (ch == '}' && top == '{') ||
                            (ch == ']' && top == '[')) {
                        st.pop();  // matched pair
                    } else {
                        v++; // mismatched closing bracket
                    }
                } else {
                    v++; // no matching opening bracket
                }
            }
        }

        // Any unmatched opening brackets left
        v += st.size();
        return v;
    }

    public static void main(String[] args) {
        String s = "{[]}}";
        System.out.println(moves(s));  // Output: 1
    }
}
