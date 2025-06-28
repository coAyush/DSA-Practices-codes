package Arrays;

import java.util.Arrays;

public class ArrayContatenation {
    public static void main(String[] args) {
    int [] arr={1,2,3};
    int [] res=getConcatenation(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] getConcatenation(int[] nums) {
        int [] ans=new int[2*nums.length];
        int len=nums.length;
        for(int i=0;i<nums.length;i++){
           ans[i]=nums[i];
           ans[i+len]=nums[i];
        }
        return ans;
    }
}
