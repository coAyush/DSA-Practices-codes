package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        int [] arr={3,2,4,8,9};
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int l=sc.nextInt();int r=sc.nextInt();
        for(int i=l;i<=r;i++){
            if(i>0){
                arr[i]+=arr[i-1];
                sum+=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr)+" "+sum);
    }
}
