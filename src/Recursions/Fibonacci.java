package Recursions;

public class Fibonacci {
    public static void main(String[] args) {
        int n=3;
        int a=0,b=1;
        System.out.println("nth fibonacci for sum = "+fibo(n,a,b,0));
    }

    private static int fibo(int n, int a, int b,int s) {
        if(n==0)
            return s;
        System.out.print(a+"\t");
        int next=a+b;
        a=b;
        b=next;
        return fibo(n-1,a,b,s+a);
    }
}
