//5. Remove minimum number of elements such that no common element exist in both array
//Given two arrays A[] and B[] consisting of n and m elements respectively. Find the
//minimum number of elements to remove from each array such that no common element
//exist in both.
//        Examples:
//Input: A[] = { 1, 2, 3, 4}
//B[] = { 2, 3, 4, 5, 8}
//Output: 3 [We need to remove 2, 3 and 4 from any array.]
//
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Removal {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4},arr2={2,3,4,5,8};
        int c=check(arr1,arr2);
        System.out.println(c);
    }

    private static int check(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,c=0;
        HashMap<Integer,Integer>hash=new HashMap<>();
        for (int value : arr2) {
            hash.put(value, hash.getOrDefault(value, 0) + 1);
        }
        List<Integer>list=new ArrayList<>();
        while(i<arr1.length){
            if(hash.containsKey(arr1[i])){
                c++;
                list.add(arr1[i]);
            }
            i++;
        }
        return c;
    }
}
