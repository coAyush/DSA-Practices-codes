package StackAndQueue;

import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
        String nums = "112";
        int k = 1;
        String ans = remove(nums, k);
        System.out.println(ans);
    }

    private static String remove(String nums, int k) {
        Stack<Integer>st=new Stack<>();
        int len=nums.length();
        if(k==len){
            return "0";
        }
        for(int i=0;i<nums.length();i++){
            int c=nums.charAt(i)-'0';
            while (!st.isEmpty() && !(c>=st.peek())) {
                if(k==0)
                    break;
                st.pop();
                k--;
            }
            st.push(c);
        }
        while (k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder numsBuilder = new StringBuilder();
        while (!st.isEmpty()){
            numsBuilder.append(st.pop());
        }
        boolean allZeros = numsBuilder.toString().replace("0", "").isEmpty();
        if(allZeros){
            return "0";
        }
        numsBuilder.reverse();
        while (numsBuilder.length()>0 && numsBuilder.charAt(0)=='0'){
            numsBuilder.deleteCharAt(0);
        }
        nums=numsBuilder.toString();
        return nums;
        }
    }
