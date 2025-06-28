package Recursions;

import java.util.Stack;

public class TowerOfHanoi {
    public static void main(String[] args) {
        String s="source";
        String d="destination";
        String h="helper";
        int n=2;
      int moves= Tower(n,s,d,h,0);
      System.out.println(moves);
    }

    private static int Tower(int n, String s, String d, String h,int c) {
        if(n==1){
            c++;
            System.out.println("Move plate from "+s+" to "+d);
            return 1;
        }
        System.out.println("Move " + (n-1) + " plates from " + s + " to " + h + " using " + d + " as helper");
        int moves=0;
        moves+=Tower(n-1,s,h,d,c+1);
        System.out.println("Move"+(n-1)+ "from "+h+" to "+d);
        moves+=1;
        moves+= Tower(n-1,h,d,s,c+1);
        return moves;
    }
}
