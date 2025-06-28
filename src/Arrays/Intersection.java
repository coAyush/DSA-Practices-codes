package Arrays;

import java.util.ArrayList;
//Note that Array is sorted
public class Intersection {
    public static void main(String[] args) {
        int [] arr1={1,2,3,3,4};
        int [] arr2={1,3,3,5,8};
        //ArrayList<Integer>list=intersectionBrute(arr1,arr2);
       // System.out.println(list);
        ArrayList<Integer>list=intersectionOptimal(arr1,arr2);
        System.out.println(list);
    }

    private static ArrayList<Integer> intersectionOptimal(int[] arr1, int[] arr2) {
        ArrayList<Integer>list=new ArrayList<>();
        int i=0;
        int j=0;
        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]) {
                i++;
            }
            else if (arr2[j]<arr1[i]) {
                j++;
            }
            else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        return list;
    }

    private static ArrayList<Integer> intersectionBrute(int[] arr1, int[] arr2) {
        ArrayList<Integer>list=new ArrayList<>();
        int last=Integer.MIN_VALUE;
        for (int j : arr1) {
            for (int k : arr2) {
                if (j == k && last != j) {
                    list.add(j);
                    last = j;
                    break;
                }
            }

        }
        return list;
    }
}
