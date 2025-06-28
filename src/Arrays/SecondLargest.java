package Arrays;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr={1,2,6,5,5,4};
        int [] ar=second(arr);
        System.out.println(Arrays.toString(ar));

    }
    public static int[] second(int[] arr){
        int s=secondLargest(arr);
        int s2=secondSmallest(arr);
        return new int[]{s,s2};
    }
    public static int secondLargest(int[] arr) {
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>largest){
                second=largest;
                largest=i;

            }
            else if(i<largest && i>second){
                second=i;

            }
        }
        return second;
    }

    public static int secondSmallest(int[] arr) {
        int smallest=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i:arr){
            if(i<smallest){
                second=smallest;
                smallest=i;

            }
            else if(i>smallest && i<second){
                second=i;

            }
        }
        return second;
    }
}
