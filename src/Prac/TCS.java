package Prac;

import java.util.Scanner;

public class TCS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of test cases");
        int T=sc.nextInt();
        int i=0;
        while(i<T){
            System.out.println("enter 3 integers");
            System.out.println("minimum operations to make all 3 equal =" +operations(sc.nextInt(),sc.nextInt(),sc.nextInt()));
            i++;
        }
    }

    private static int operations(int i, int i1, int i2) {
        int p=i,q=i1,r=i2;
        int op=0;
        if(p==q & q==r)
            return 0;
        while (!(r<0)){
            p+=1;q+=1;r-=1;
            op++;
            if(p==q & q==r)
                break;
        }
        if(r<0)
            return -1;
        return op;
    }
}
