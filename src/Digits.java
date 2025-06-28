public class Digits {
    public static void main(String[] args) {
        int n=1343;
        int sum=0;
        sum+=digits(n);
        System.out.println(sum);
    }
    static int digits(int n){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        return rem+digits(n/10);
    }
}
