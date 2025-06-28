package Prac;

public class Fibonacci {
    public static void main(String[] args) {
        int n=4;
        int a=0,b=1;
        System.out.println(fib(n,a,b,0));
        System.out.println(fibn(n,a,b));
    }

    private static int fib(int n, int a, int b, int sum) {
        if(n==0)
            return sum;
        return fib(n-1,b,a+b,sum+a);
    }
    //nth fibo
    private static int fibn(int n,int a,int b){
        if(n==0)
            return a;
       return fibn(n-1,b,a+b);
    }
}
