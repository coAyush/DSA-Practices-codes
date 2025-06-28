package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArrayToRight {
    public static void main(String[] args) {
        int d=2;
        int [] arr={-1,-100,3,99};
      //  rotateBrute(arr,d);
       // System.out.println(Arrays.toString(arr));
        rotateOptimal(arr,d);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int [] arr,int s,int e ) {
        for (int i = s; i <= e; i++,e--) {
            int temp = arr[i];
            arr[i] = arr[e];
            arr[e] = temp;
        }
    }
    private static void rotateOptimal(int[] arr, int d) {
        d=d%arr.length;
        reverse(arr,arr.length-d,arr.length-1);
        reverse(arr,0,arr.length-d-1);
        reverse(arr,0, arr.length-1);

    }
    private static void rotateBrute(int[] arr, int d) {
        d = d % arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = d + 1; i < arr.length; i++) {
            list.add(arr[i]);
        }
        int len = arr.length - 1;
        for (int i = d; i >= 0; i--) {
            arr[len--] = arr[i];
        }
        int i = d;
        for (Integer j : list) {
            arr[i - d] = j;
            i++;
        }
    }

}
