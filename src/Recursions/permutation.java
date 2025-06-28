package Recursions;

import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static void main(String[] args) {
        int [] arr={5,4,1,2};
        List<List<Integer>>list=permutationF(arr,0,new ArrayList<Integer>());
        for(List<Integer>l:list){
            System.out.println(l);
        }
    }

    private static List<List<Integer>> permutationF(int[] arr, int i, List<Integer> integers) {
        if(i== arr.length)
        {
            List<List<Integer>>list=new ArrayList<>();
            list.add(integers);
            return list;
        }
        //just taking of elements
        List<Integer>p=new ArrayList<>(integers);
        p.add(arr[i]);
        List<List<Integer>>per=permutationF(arr,i+1,p);
        return per;
    }
}
