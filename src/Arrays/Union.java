package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
public class Union {
    public static void main(String[] args) {
        int [] arr1={1,1,2,3,4,5};
        int [] arr2={1,3,6,6,7};
        System.out.println(Arrays.toString(arr1)+"\n"+Arrays.toString(arr2)+"\n");
        //ArrayList<Integer>list=unionBrute(arr1,arr2);
        //System.out.println(list);
        ArrayList<Integer>list=unionOptimal(arr1,arr2);
        System.out.println(list);
    }
    private static ArrayList<Integer> unionOptimal(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int last=Integer.MIN_VALUE;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (arr1[i]!=last)
                    list.add(arr1[i]);
                last=arr1[i];
                i++;
            } else {
                if (arr2[j]!=last)
                    list.add(arr2[j]);
                last=arr2[j];
                j++;
            }
        }
        while (i < arr1.length) {
            if (!list.contains(arr1[i]))
                list.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) {
            if (!list.contains(arr2[j]))
                list.add(arr2[j]);
            j++;
        }
        return list;
    }
    private static ArrayList<Integer> unionBrute(int[] arr1, int[] arr2) {
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for(int i:arr1){
            set.add(i);
        }
        for(int i:arr2){
            set.add(i);
        }
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(set);
        return list;
    }
}
