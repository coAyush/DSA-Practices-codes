//Game of two stacks
package StackAndQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameOfStacks {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
       List<Integer>b=new ArrayList<>(Arrays.asList(6,7,8,9));
        int sum=10;
        int moves=countMoves(a,b,sum,0,0,0,0);
        System.out.println(moves);
    }
    private static int countMoves(List<Integer> a,List<Integer> b, int sum, int runningSum, int count,int i,int j) {
        if(runningSum >sum)
            return count-1;
        int max=count;
        if(!(i==a.size())){
            int c1 = countMoves(a, b, sum, runningSum + a.get(i), count + 1,i+1,j);
            max= Math.max(max,c1);
        }
         if(!(j==b.size())){
            int c2 = countMoves(a,b, sum, runningSum + b.get(j), count + 1,i,j+1);
            max= Math.max(max,c2);
        }
        return max;
    }
}
