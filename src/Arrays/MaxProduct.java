package Arrays;

public class MaxProduct {
    public static void main(String[] args) {
         int [] arr={-100,-98,-1,2,3,4};
         int max=maximumProduct(arr);
        System.out.println(max);
        }
    public static int maximumProduct(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>max1){
                max3=max2;
                max2=max1;
                max1=i;
            } else if (i<max1 && (i>max2 && i>max3)) {
                max3=max2;
                max2=i;
            }
            else {
                max3=i;
            }
        }
        return max1*max2*max3;
    }
}
