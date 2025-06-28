package Arrays;

public class SortedAndRotated {
    public static void main(String[] args) {
        int [] arr={3,4,5,1,2};
        System.out.println("The given array is sorted and roatated \n"+ check(arr));
    }

    private static boolean check(int[] arr) {
       int  count=0;
        for(int i=0;i< arr.length-1;i++){
           if(arr[i]>arr[i+1])
               count++;
        }
        if(arr[arr.length-1]>arr[0])
            count++;
        return count<=1;
    }
}
