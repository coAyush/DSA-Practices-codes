package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr={2,5,6,8,14};
        int target=20;
        int [] brute=bruteApproach(arr,target);
        System.out.println(Arrays.toString(brute));
      /*  int [] better=betterApproach(arr,target);
        System.out.println(Arrays.toString(better));
        int [] optimal=optimalApproach(arr,target);
        System.out.println(Arrays.toString(optimal));*/
    }

    private static int[] bruteApproach(int[] arr, int target) {
        for(int i=0;i<arr.length-1;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    private static int [] optimalApproach(int[] arr, int target) {
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target)
                return new int []{i,j};
            if(arr[i]+arr[j]<target)
                i++;
            else
                j++;
        }
        return new int []{-1,-1};
    }

    private static int[] betterApproach(int[] arr, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            int num=target-arr[i];
            if(map.containsKey(num))
                return new int []{i, map.get(num)};
            map.put(arr[i],i );
        }
        return new int []{-1,-1};
    }

}
