package StackAndQueue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){

            int ch=nums2[i];
            while(!st.isEmpty() && st.peek()<=ch){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(ch,-1);
            }
            else{
                map.put(ch,st.peek());
            }
            st.push(ch);
        }
        int [] nge=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            nge[i]=map.get(nums1[i]);
        }
        return nge;
    }

    public static void main(String[] args) {
        NextGreaterElement n= new NextGreaterElement();
        int [] nums1={2,4};
        int [] nums2={1,2,3,4};
        System.out.println(Arrays.toString(n.nextGreaterElement(nums1, nums2)));
    }
}