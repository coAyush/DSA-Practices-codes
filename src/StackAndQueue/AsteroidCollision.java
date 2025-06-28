// LeetCode : 735. Asteroid Collision
package StackAndQueue;
import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int [] arr={-2,-1,1,2};
        for (int ch : arr) {
            boolean destroyed = false;

            while (!st.isEmpty() && st.peek() > 0 && ch < 0) {
                if (Math.abs(st.peek()) < Math.abs(ch)) {
                    st.pop();  // top is destroyed, ch continues
                } else if (Math.abs(st.peek()) == Math.abs(ch)) {
                    st.pop();  // both destroyed
                    destroyed = true;
                    break;
                } else {
                    // ch is destroyed
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                st.push(ch);
            }
        }

        // Convert stack to array
        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        System.out.println(Arrays.toString(ans));
    }
}
