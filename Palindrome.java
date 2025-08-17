package Strings;
public class Palindrome {
    public static void main(String[] args) {
        String s="a good   example",rev="";
        s=s.trim();
        int start=s.length(),end=s.length();
        char sp=' ';int count=0;
        StringBuilder b=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(sp==s.charAt(i)){
                count++;
                if(count==1)
                end=start;
                start=i;
                b.append(s, start, end+1);
                b.append(sp);
            }

        }
    }
}
