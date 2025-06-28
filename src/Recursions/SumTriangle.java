package Recursions;

import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sumTriangle(arr);

    }

    static void  sumTriangle(int[] arr) {
        if(arr.length==1) {
            System.out.println( Arrays.toString(arr));
            return;
        }
        int [] arr_n=new int[arr.length-1];
        for(int i=0;i< arr_n.length;i++){
            arr_n[i]=(arr[i]+arr[i+1]);
        }

         sumTriangle(arr_n);
        System.out.println(Arrays.toString(arr));
    }
}