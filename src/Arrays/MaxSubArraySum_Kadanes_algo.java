package Arrays;
import java.util.ArrayList;
import java.util.List;

public class MaxSubArraySum_Kadanes_algo {
    public static void main(String[] args) {
        int [] nums={2,-4,1,2,5,9,-5,-4,1,6,4};
       int max=maxSubArray(nums);
        System.out.println(max);
       List<Integer> list=maxiSubArray(nums);
        System.out.println(list);
    }
    //Kadane's algo(optimal)
    public static int maxSubArray(int[] nums) {
            int sum=0;
            int max=Integer.MIN_VALUE;
        for (int num : nums) {
            sum += num;
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
            return max;
    }
    public static List<Integer> maxiSubArray(int[] nums) {
        int sum=0;
        List<Integer>list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int start=-1;
        int ansStarrt=-1,ansEnd=-1;
        for(int i=0;i<nums.length;i++){
            if(sum==0)
                start=i;
            sum+=nums[i];
            if(sum>max){
                max=sum;
                ansStarrt=start;
                ansEnd=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        for(int i=ansStarrt;i<=ansEnd;i++){
         list.add(nums[i]);
        }
        return list;
    }
}
