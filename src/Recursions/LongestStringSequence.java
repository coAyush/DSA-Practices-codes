package Recursions;

import java.util.ArrayList;

public class LongestStringSequence {
    public static void main(String[] args) {
        String s="abcssmghj";
        ArrayList<String>list=new ArrayList<>();
        longest(s,"",0,list);
        System.out.println("Substring are"+list);
        String s1=compare(list);
        System.out.println(s1);

    }
    static String longest(String str,String s,int i,ArrayList<String>list){
        if(i==str.length()) {
            list.add(s);
            return s;
        }
        if(s.contains(String.valueOf(str.charAt(i)))){
            list.add(s);
           return longest(str,"",i,list);
        }
        return longest(str,s+str.charAt(i),i+1,list);
    }
    static String compare(ArrayList<String>list){
        String longest="";
        for(String s:list)
        {
            if(s.length()>longest.length())
                longest=s;
        }
        return longest;
    }
}
