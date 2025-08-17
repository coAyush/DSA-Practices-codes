package Strings;


public class ReverseVowels {
    public static void main(String[] args) {
        String s="hello";
        StringBuilder b=new StringBuilder(s);
        int i=0,j=s.length()-1;
        while(i<j){
           char c=s.charAt(i);
           char cg=s.charAt(j);
           if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')){
               i++;
           } else if (!(cg=='a'||cg=='e'||cg=='i'||cg=='o'||cg=='u'||cg=='A'||cg=='E'||cg=='I'||cg=='O'||cg=='U')) {
               j--;
           }
           else{
               b.setCharAt(i,cg);
               b.setCharAt(j,c);
               i++;
               j--;
           }
        }
        System.out.println(b);
    }
}
