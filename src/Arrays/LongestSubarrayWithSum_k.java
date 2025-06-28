package Arrays;

public class LongestSubarrayWithSum_k {
    public static void main(String[] args) {
        int [] arr={1,2,1,2,1};
        int k=6;
        int len=optimalApproach(arr,k);
        System.out.println(len);
    }

    private static int optimalApproach(int[] arr, int k) {
        int left=0;
        int right=0;
        int maxLength=0;
        int sum=0;
        while(right<arr.length) {
            sum += arr[right];
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
        }
        return maxLength;
    }
}
