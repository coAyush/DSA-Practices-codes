package Recursions;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<ArrayList<Integer>>l=subset(arr,list,0);
        System.out.println(l);
    }

    private static ArrayList<ArrayList<Integer>> subset(int[] arr, ArrayList<Integer> l,int i) {
        if(i==arr.length)
        {
         ArrayList<ArrayList<Integer>>li=new ArrayList<>();
         li.add(new ArrayList<>(l));
         return li;
        }
        ArrayList<ArrayList<Integer>>left=subset(arr,l,i+1);
        ArrayList<Integer>newlist=new ArrayList<>(l);
        newlist.add(arr[i]);
        ArrayList<ArrayList<Integer>>right=subset(arr,newlist,i+1);
        left.addAll(right);
        return left;
    }
}

