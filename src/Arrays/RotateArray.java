package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] a0rgs) {
        int [] arr={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
      //  reverse(arr,0,arr.length-1);
        int d=24;

      //  arrayRotate(arr);
       // System.out.println(Arrays.toString(arr));
      arrayRotatebyD(arr, new ArrayList<>(),d);
        System.out.println(Arrays.toString(arr));
     //   arrayRotatebyDOptimal(arr,d);0000
   //    System.out.println(Arrays.toString(arr));
    }

    /*private static void arrayRotatebyDOptimal(int[] arr, int d) {
        d=d%arr.length;
        reverse(arr,0,d-1);
        reverse(arr,arr.length-d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }*/

    //Rotate array by n places to left
    private static void arrayRotatebyD(int[] arr, ArrayList<Integer> list, int d) {
        d=d%arr.length;
        for(int i=0;i<d;i++){
            list.add(arr[i]);
        }
        System.out.println(list.toString());
        for(int i=d;i<arr.length;i++){
            arr[i-d]=arr[i];
        }
        int i=d;
        for (Integer integer : list) {
            arr[++i] = integer;
        }
    }

    //Rotate to left by 1 place (optimal)
    private static void arrayRotate(int[] arr) {
        int temp=arr[0];
        for (int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;

    }
  /*  public static void reverse(int [] arr,int s,int e ){
        for(int i=s;i<=e;i++){
            int temp=arr[i];
            arr[i]=arr[e];
            arr[e]=temp;
            e--;
        }
      //  System.out.println(Arrays.toString(arr));
    }*/
}
