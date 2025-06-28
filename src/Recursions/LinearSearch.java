package Recursions;

import java.util.ArrayList;

public class LinearSearch {
    static ArrayList<Integer> list=new ArrayList<>();
    @Override
    public  String toString() {
        return "LinearSearch[" +
                "list=" + list +
                ']';
    }

    public static void main(String[] args) {
        int [] arr={2,4,9,5,12,9};
        int target=9;
      search(arr,target,0);
        System.out.println(list);
    }
    static void  search(int [] arr,int target,int i){
        if(i>=arr.length)
            return;
        if(arr[i]==target)
            list.add(i);
         search(arr,target,i+1);
    }
}
