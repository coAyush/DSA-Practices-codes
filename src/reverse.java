public class reverse {
    public static void main(String[] args) {
        int n = 2456;
        int ans = rev(n);
        boolean check = palindrome(ans, n);
        System.out.println(ans);
        if (check) {
            System.out.println("palindrome");
        }
    }
    static int rev(int n){
        if(n==0)
            return 0;
        String s=String.valueOf(n);
        int length=s.length();
        return ((n%10)*(int)Math.pow(10,length-1))+rev(n/10);
    }
    static boolean palindrome(int ans,int n){
        return ans==n;
    }

}
