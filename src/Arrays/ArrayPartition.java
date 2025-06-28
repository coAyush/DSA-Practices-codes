//6. Given an integer array nums, return true if you can partition the array into two subsets
//such that the sum of the elements in both subsets is equal or false otherwise.
//Example 1:
//Input: nums = [1,5,11,5]
//Output: true
//Explanation: The array can be partitioned as [1, 5, 5] and [11].
package Arrays;
//Note : Incorrect just for practise
import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        int [] arr={1,5,11,5};
        boolean partition=check(arr);
        System.out.println(partition);
    }

    private static boolean check(int[] arr) {
        Arrays.sort(arr);
        int [] ar2={arr[arr.length-1]};
        int[]ar1=new int[arr.length-1];
        int sum=0;
        System.arraycopy(arr, 0, ar1, 0, ar1.length);
        for (int i:ar1)
            sum+=i;
        int i=0;
        return sum == ar2[i];
    }
}
