package StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class PreviousSmallerElement {
    public static int[] previousSmaller(int [] nums){
        Stack<Integer>st=new Stack<>();
        int [] pve=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int ch=nums[i];
                while(!st.isEmpty() && ch<=st.peek())
                {
                    st.pop();
                }if(st.isEmpty()){
                pve[i]=-1;
            }
            else {
                pve[i]=st.peek();
            }
            st.push(ch);
        }
        return pve;
    }
    public static void main(String[] args) {
        int  [] nums={2,4,3,10};
        System.out.println(Arrays.toString(previousSmaller(nums)));
    }
}
