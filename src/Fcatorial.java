public class Fcatorial {
    public static void main(String[] args) {
        int n=5;
        int ans = fact(5);
        System.out.println(ans);
    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }

}
