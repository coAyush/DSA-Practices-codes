package Recursions;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        subsequence(" ","abc");
       //ArrayList<String>list= subSeqReturn(" ","ac");
      //  System.out.println(list.toString());
    }
    static void subsequence(String p,String up){
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subsequence(p+ch,up.substring(1));
        subsequence(p,up.substring(1));
        subsequence(p+(ch+0),up.substring(1));
    }
    static ArrayList<String> subSeqReturn(String p,String up){
        if(up.isEmpty())
        {
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>left=subSeqReturn(p+ch,up.substring(1));
        ArrayList<String>right=subSeqReturn(p,up.substring(1));
        ArrayList<String>ascii=subSeqReturn(p+0,up.substring(1));
        left.addAll(right);
        left.addAll(ascii);
        return left;
    }
}
