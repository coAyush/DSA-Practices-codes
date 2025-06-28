package Recursions;
import java.util.ArrayList;
public class LS_with_List {

    public static void main(String[] args) {
        int [] arr={2,4,6,9,4,5};
        int target=4;
        ArrayList<Integer> list=search(arr,target,0);
        System.out.println(list);
    }
    static ArrayList<Integer> search(int [] arr,int target,int i){
       ArrayList<Integer> list=new ArrayList<>();
        if(i==arr.length)
            return list;
        if(arr[i]==target)
            list.add(i);
        ArrayList<Integer> lst=search(arr,target,i+1);//it contains elements of below function call
        list.addAll(lst);
        return list;
    }
}
