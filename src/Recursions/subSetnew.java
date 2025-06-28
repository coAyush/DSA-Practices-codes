package Recursions;

import java.util.ArrayList;
import java.util.List;

public class subSetnew {
    public static void main(String[] args) {
        int [] arr={5,4};
        List<List<Integer>>list=subset(arr,0,new ArrayList<Integer>());
        for(List<Integer>l:list){
            System.out.println(l);
        }
    }

    private static List<List<Integer>> subset(int [] arr,int i,List<Integer>processed) {
        if(i== arr.length)
        {
            List<List<Integer>>list=new ArrayList<>();
            list.add(processed);
            return list;
        }
        //take the element
        List<Integer>list1=new ArrayList<>(processed);
        list1.add(arr[i] );
        List<List<Integer>>left=subset(arr,i+1,list1);
        //reject the element
        List<Integer>list2=new ArrayList<>(processed);
        List<List<Integer>>right=subset(arr,i+1,list2);
        //combine
         left.addAll(right);
         return left;
    }
}
