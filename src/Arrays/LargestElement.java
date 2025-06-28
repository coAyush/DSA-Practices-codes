package Arrays;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {8, 2, 9, 4, 7, 1};
        System.out.println(Arrays.toString(arr));
        int largestBrute = findLargestBrute(arr);//brute
        System.out.println(largestBrute);
      /*  int largest = findLargest(arr);//optimal
        System.out.println(largest);*/
    }
    static int findLargestBrute(int [] arr){  //TC=O(NlogN)=
        Arrays.sort(arr);
     return arr[arr.length-1];
    }

     static int findLargest(int[] arr) { //O(logN)
        int largest =arr[0];
         for (int i:arr) {
             if(largest<i)
                 largest=i;
         }
         return largest;
    }
}
