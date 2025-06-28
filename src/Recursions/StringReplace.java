package Recursions;

public class StringReplace {
    public static void main(String[] args) {
        String s="bappleccada";
        String s1=check(s,0,s.length());
        System.out.println(s1);
    }
    static String check(String s, int st,int e) {
        if (st == e) {
            return "";
        }
        if(s.startsWith("app",st)&& !s.startsWith("apple",st))
            return ""+check(s,st+3,e);
        return s.charAt(st)+check(s,st+1,e);
    }
}
