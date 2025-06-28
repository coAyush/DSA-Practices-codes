package Recursions;

import java.util.Scanner;

public class Substring {
    static boolean check(String s1,String s2,int i,int j){
        if(j==s1.length())
            return false;
        if (i==s2.length())
            return true;
        if(s2.charAt(i)==s1.charAt(j)){
           if (check(s1,s2,i+1,j+1)){
               return true;
            }
        }
        return check(s1,s2,0,j+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the strings");
        String s1=sc.next();
        String s2=sc.next();
        boolean ch=check(s1,s2,0,0);
        if(ch)
            System.out.println("found");
    }
}
