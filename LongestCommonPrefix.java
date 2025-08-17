package Strings;

import java.util.Stack;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flow","flower", "flight"};
       String s=str[0];
       if(str.length==0)
           System.out.println("nothing");;

        for(int j=1;j<str.length;j++){
            StringBuilder sb= new StringBuilder();
       for(int i = 0; i < s.length() && i < str[j].length(); i++){
               if(s.charAt(i)==str[j].charAt(i)){
                   sb.append(s.charAt(i));
               }
               else
                   break;
           }
       s=sb.toString();
       if(s.isEmpty())
           break;
       }
        System.out.println(s);
    }
}
