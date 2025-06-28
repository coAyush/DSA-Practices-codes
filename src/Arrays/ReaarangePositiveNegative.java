package Arrays;
import java.util.Arrays;
public class ReaarangePositiveNegative {
    public static void main(String[] args) {
        int[] arr = {-5, -7, 4, 5, -8, 8};
        int [] arr2={2,-2,-5,5,1,7};
        secondVariety(arr2);
      //  brute(arr);
        optimal(arr);
    }

    private static void secondVariety(int[] arr2) {
        int p = 0;  // count of positives
        int q = 0;  // count of negatives

        // Count positives and negatives
        for (int i : arr2) {
            if (i > 0) p++;
            else q++;
        }

        int[] ans = new int[arr2.length];
        int j = 0;  // even indices for positives
        int k = 1;  // odd indices for negatives

        // Place elements alternately
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > 0 && p > 0) {
                if (j < arr2.length) {
                    ans[j] = arr2[i];
                    j += 2;
                    p--;
                }
            } else if (arr2[i] < 0 && q > 0) {
                if (k < arr2.length) {
                    ans[k] = arr2[i];
                    k += 2;
                    q--;
                }
            }
        }

        // Place remaining elements
        for (int i = 0; i < arr2.length; i++) {
            if (p == 0 && arr2[i] < 0 && k < arr2.length) {
                ans[k] = arr2[i];
                k++;
            } else if (q == 0 && arr2[i] > 0 && j < arr2.length) {
                ans[j] = arr2[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(ans));
    }

    public static void brute(int [] arr){
        int [] arr_p=new int[arr.length/2];
        int [] arr_n=new int[arr.length/2];
        int j=0,k=0;
        for(int i:arr){
            if(i<0)
                arr_n[k++]=i;
            else
                arr_p[j++]=i;
        }
        j=0; 
        k=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0)
                arr[i]=arr_p[j++];
            else
                arr[i]=arr_n[k++];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void optimal(int [] arr){
        int len= arr.length;
        int j=1;
        int k=0;
        int [] ans=new int[len];
        for(int i=0;i<len;i++){
            if(arr[i]<0){
                ans[j]=arr[i];
                j+=2;
            }
            else {
                ans[k]=arr[i];
                k+=2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
