package Arrays;

public class NumberAppearingOnce {
    public static void main(String[] args) {
        int [] arr={1,1,2,3,3,4,4};
        int c=optimalApproach(arr);
        System.out.println(c);
    }

    private static int optimalApproach(int[] arr) {
        int xor=0;
        for(int i:arr){
            xor^=i;
        }
        return xor;
    }
}
