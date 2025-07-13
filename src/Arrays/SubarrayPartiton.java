package Arrays;

import java.util.Scanner;

public class SubarrayPartiton {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter array elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The partition can be done : "+partition(arr));
    }

    private static boolean partition(int[] arr) {
        int totalSum=0,prefixSum=0;
        for(int i:arr){
            totalSum+=i;
        }
        for (int j : arr) {
            prefixSum += j;
            if (prefixSum == totalSum - prefixSum) {
                return true;
            }
        }
        return false;
    }
}
