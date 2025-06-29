package StackAndQueue;

import java.util.Stack;

public class SubarraySumRange {

    public static void main(String[] args) {
        int [] arr={1,2,3};
        int smallest=subarrayMin(arr);
        int largest=subarrayMax(arr);
        int range=largest-smallest;
        System.out.println(range);
    }

    private static int subarrayMin(int[] arr) {
        int [] left=previousSmallest(arr);
        int [] right=nextSmallest(arr);
        long sum=0;int mod=(int)1e9+7;
        for(int i=0;i<arr.length;i++){
            int ch=arr[i];
            int leftCount=i-left[i];
            int rightCount=right[i]-i;
            sum=(sum+((long) ch *leftCount*rightCount)%mod)%mod;
        }
        return (int)sum;
    }

    private static int [] previousSmallest(int[] arr) {
        int [] pse=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            int ch=arr[i];
            while(!st.isEmpty() && arr[st.peek()]>ch){
                st.pop();
            }
            if(st.isEmpty())
                pse[i]=-1;
            else
                pse[i]=st.peek();
            st.push(i);
        }
        return pse;
    }
    private static int [] nextSmallest(int[] arr) {
        int [] nse=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            int ch=arr[i];
            while(!st.isEmpty() && arr[st.peek()]>=ch){
                st.pop();
            }
            if(st.isEmpty())
                nse[i]=arr.length;
            else
                nse[i]=st.peek();
            st.push(i);
        }
        return nse;
    }
    private static int subarrayMax(int[] arr) {
        int [] left=previousLargest(arr);
        int [] right=nextLargest(arr);
        long sum=0;int mod=(int)1e9+7;
        for(int i=0;i<arr.length;i++){
            int ch=arr[i];
            int leftCount=i-left[i];
            int rightCount=right[i]-i;
            sum=(sum+((long) ch *leftCount*rightCount)%mod)%mod;
        }
        return (int)sum;
    }

    private static int [] previousLargest(int[] arr) {
        int [] ple=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            int ch=arr[i];
            while(!st.isEmpty() && arr[st.peek()]<ch){
                st.pop();
            }
            if(st.isEmpty())
                ple[i]=-1;
            else
                ple[i]=st.peek();
            st.push(i);
        }
        return ple;
    }
    private static int [] nextLargest(int[] arr) {
        int [] nle=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            int ch=arr[i];
            while(!st.isEmpty() && arr[st.peek()]<=ch){
                st.pop();
            }
            if(st.isEmpty())
                nle[i]=arr.length;
            else
                nle[i]=st.peek();
            st.push(i);
        }
        return nle;
    }
}
