// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.lang.reflect.Array;
import java.util.Arrays;

class pattern {
    public static void main(String[] args) {
        //printStar(4,0);
        int[] arr = {3, 4, 1, 2};
        Bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void printStar(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            printStar(r, c + 1);
            System.out.print("*");

        } else {
            printStar(r - 1, 0);
            System.out.println();

        }
    }
    static void Bubble(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            Bubble(arr, r, c + 1);

        } else {
            Bubble(arr, r - 1, 0);
        }
    }
}