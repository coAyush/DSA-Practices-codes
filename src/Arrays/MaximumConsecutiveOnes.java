package Arrays;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int [] arr={1,1,0,1,1,1,5,1,1,1,1};
        int max=consecutiveMax(arr);
        System.out.println(max);
    }

    private static int consecutiveMax(int[] arr) {
            int c=0;
        int c1=0;
        for(int i:arr){
            if(i==1){
                c1++;
            }
            else {
                c = Math.max(c, c1);
                c1=0;
            }
        }
       return Math.max(c,c1);
    }
}
