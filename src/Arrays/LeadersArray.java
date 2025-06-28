package Arrays;

import java.util.ArrayList;

public class LeadersArray {
    public static void main(String[] args) {
        int [] arr={1, 2, 5, 3, 1, 2};
       // ArrayList<Integer>list=brute(arr);
        //System.out.println(list);
        ArrayList<Integer>list2=optimal(arr);
        System.out.println(list2);
    }

    private static ArrayList<Integer> optimal(int[] arr) {
        ArrayList<Integer>list=new ArrayList<>();
        int maxi=Integer.MIN_VALUE;
        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]>maxi){
                maxi=arr[i];
                list.add(0,maxi);
            }
        }
        return list;
    }

    private static ArrayList<Integer> brute(int[] arr) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]<arr[j]){
                    i=j;
                }
            }
            list.add(arr[i]);
        }
        return list;
    }
}

