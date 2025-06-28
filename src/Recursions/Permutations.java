package Recursions;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
       // permutations("", str);
      //  ArrayList<String>list=new ArrayList<>();
      //  permutationsList("",str,list);
     //   System.out.println("np. of combinations="+list.size());
       // System.out.println(list);
        int c=count("",str);
        System.out.println(c);
    }
   /* static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i);
            permutations(first + ch + second, up.substring(1));
        }
    }*/
   /* static ArrayList<String> permutationsList (String p, String up,ArrayList<String> list){
            if (up.isEmpty()) {
               list.add(p);
               return list;
            }
            char ch = up.charAt(0);
            for (int i = 0; i <= p.length(); i++) {
                String first = p.substring(0, i);
                String second = p.substring(i);
                 permutationsList(first+ch+second,up.substring(1),list);
            }
            return list;

    }  */
    static int count(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int co=0;
        char c=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String l=p.substring(i);
            co+=count(f+c+l,up.substring(1));
        }
        return co;
    }
}
