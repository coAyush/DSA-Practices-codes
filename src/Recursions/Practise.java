package Recursions;

import java.util.ArrayList;
import java.util.List;

public class Practise {
    public static void main(String[] args) {
        int [] arr={2,3,1,4};
        int target=7;
        List<Integer>p=new ArrayList<>();
        List<List<Integer>>list=new ArrayList<>();
        List<List<Integer>> list1=check(arr,p,list,0);
        for (List<Integer>list2:list1){
            System.out.println(list2);
        }

    }

    private static List<List<Integer>> check(int[] arr, List<Integer> p, List<List<Integer>> list, int i) {
        if(i == arr.length){
            list.add(p);
            return list;
        }
        //take integer;
        p.add(arr[i]);
        list.add(p);
        check(arr,p,list,i+1);
        list.add(p);
        check(arr,p,list,i+1);
        return list;
    }
}
