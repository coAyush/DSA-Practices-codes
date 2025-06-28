// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Recusrsion1 {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
}