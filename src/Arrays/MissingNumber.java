package Arrays;
class MissingNumbers{
    public static void main(String[] args) {
        //We will be provided with only 1 to N-1 nos. in array
        int [] arr={1,2,4,5};
        int n=5;
       //bruteMissing(arr,n);
       //int m=optimalXorMissing(arr,n);
        //System.out.println(m);
        int m2=optimalSumMissing(arr,n);
        System.out.println("Using sum "+ m2);
    }

    private static int optimalSumMissing(int[] arr, int n) {
        int s1=(n*(n+1))/2;
        int s2=0;
        for (int i:arr){
            s2+=i;
        }
        return s1-s2;
    }

    private static int optimalXorMissing(int[] arr, int n) {
        int xor1=0;
        int xor2=0;
        for(int i=0;i<n-1;i++){
            xor2^=arr[i];
            xor1^=(i+1);
        }
        xor1^=n;
        return xor1^xor2;
    }

    private static void bruteMissing(int[] arr,int n) {
        int m=0;
        int j=0;
        for (int i=1;i<=n;i++){
            for(;j<n-1;j++){
                if(i==arr[j])
                {
                    break;
                }
                else {
                    m=i;
                }

            }
            j++;
        }
        System.out.println(m);
    }
}
