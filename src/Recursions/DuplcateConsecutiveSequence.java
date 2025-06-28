package Recursions;

public class DuplcateConsecutiveSequence {
    public static void main(String[] args) {
        String str="aabbccbba";
        String st=deleteConsecutive(str);
        System.out.println(st);
    }

    private static String deleteConsecutive(String str) {
        return deleteHelper("",str,0);
    }

    private static String deleteHelper(String p, String up, int i) {
        if(i>=up.length())
            return p;
        if((i+1)<up.length() && up.charAt(i)==up.charAt(i+1))
            return deleteHelper(p,up,i+1);
        return deleteHelper(p+up.charAt(i),up,i+1);
    }
}
