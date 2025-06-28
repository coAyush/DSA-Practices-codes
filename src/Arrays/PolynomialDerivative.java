package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class PolynomialDerivative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the highest degree");
        int degree=sc.nextInt();
        int [] poly=new int[degree+1];
        System.out.println("enter the coefficient from x^5 till x^0 ");
        for (int i=degree;i>=0;i--){
            poly[i]=sc.nextInt();
        }
        int [] derivatuve =new int[degree];
        for (int i=degree-1;i>=0;i--){
            derivatuve[i]=poly[i+1]*(i+1);
        }
        String[] s=new String[derivatuve.length+1];
        for (int i=degree-1;i>=0;i--) {
            if (derivatuve[i] != 0) {
                s[i] = derivatuve[i] + "x^" + i + "+";
            }
        }
        String s2=s[s.length];
            s2=s2.substring(0,s2.length()-1);
            s[s.length]=s2;
    }
}

