package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int [] arr={4,5,4,4};
      /*  int e=brute(arr);
        System.out.println(e);*/
      /*  int e2=better(arr);
        System.out.println(e2);*/
        int e3=optimal(arr);
        System.out.println(e3);
    }
//Moore's voting
    private static int optimal(int[] arr) {
        int el = arr[0];
        int c = 1;
        for (int i = 1; i < arr.length; i++) {
            if (el == arr[i])
                c++;
            else
                c--;
            if (c == 0) {
                el = arr[i];
                c = 1;
            }
        }
        for (int i : arr) {
            if (i == el)
                c++;
        }
        return (c > arr.length/2) ? el : -1;
    }

    private static int better(int[] arr) {
        Map<Integer,Integer>map=new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 1) + 1);
        }
        for (Map.Entry<Integer,Integer>ma: map.entrySet()){
            if(ma.getValue()>arr.length/2)
                return ma.getKey();
        }
        return -1;
    }

    private static int brute(int[] arr) {
        int c=0;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    c++;
                }
            }
            if(c> arr.length/2)
                return arr[i];
        }
        return -1;
    }
}
