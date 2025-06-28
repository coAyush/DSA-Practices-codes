package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int [] arr={0,1,6,0,4,8,0,9};
        System.out.println(Arrays.toString(arr));
        //arr=Brute(arr);
          arr= move(arr);
        System.out.println(Arrays.toString(arr));

    }
    //Brute
    static int [] Brute(int [] arr){
        ArrayList<Integer>list=new ArrayList<>();
        for(int i:arr){
            if(i!=0)
               list.add(i);
        }
        int i=0;
        for(;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        for (;i< arr.length;i++){
            arr[i]=0;
        }
        return arr;
    }
    //Optimal
    public static int [] move(int [] arr){
        int i=-1;
        for(int j=0;j< arr.length;j++){
            if(arr[j]==0){
                i=j;
                break;
            }
        }
        if(i==-1)
            return arr;
        for(int j=i+1;j< arr.length;j++){
            if(arr[j]!=0){
                swap(i,j,arr);

            }
        }
        return arr;
    }

    private static void swap(int i, int j,int []arr) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
