package StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

class NextGreaterElement_II {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int [] nge=new int[nums.length];
        int N=nums.length;
        for(int i=(2*N)-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%N]){
                st.pop();
            }
            if(i<N){
                if(!st.isEmpty()){
                    nge[i]=st.peek();
                }


                else{
                    nge[i]=-1;
                }
            }
            st.push(nums[i%N]);
        }
        return nge;
    }

    public static void main(String[] args) {
        NextGreaterElement_II n=new NextGreaterElement_II();
        int [] nums={1,2,1};
        System.out.println(Arrays.toString(n.nextGreaterElements(nums)));
    }
}