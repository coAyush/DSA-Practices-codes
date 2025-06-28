package StackAndQueue;

import java.util.Stack;

class SubarrayMinSum {
    public static int [] previousSmaller(int [] arr){
        Stack<Integer>st=new Stack<>();
        int [] pse=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }else{
                pse[i]=st.peek();
            }
            st.push(i);
        }
        return pse;
    }
    public static int [] nextSmaller(int [] arr){
        Stack<Integer> st=new Stack<>();
        int [] nse=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=arr.length;
            }else{
                nse[i]=st.peek();
            }
            st.push(i);
        }
        return nse;
    }
    public int sumSubarrayMins(int[] arr) {
        int [] left=previousSmaller(arr);
        int [] right=nextSmaller(arr);
        long sum=0;
        int mod = (int)1e9 + 7;
        for(int i=0;i<arr.length;i++){
            int leftCount=i-left[i];
            int rightCount=right[i]-i;
            sum=(sum+(long)arr[i]*leftCount*rightCount)%mod;
        }
        return (int)sum;
    }

    public static void main(String[] args) {
        SubarrayMinSum s=new SubarrayMinSum();
        int []arr={3,2,1,4};
        System.out.println(s.sumSubarrayMins(arr));

    }
}
