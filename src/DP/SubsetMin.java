package DP;
import java.util.ArrayList;
import java.util.List;
public class SubsetMin {
    public static void main(String[] args) {
        int[]set={3, 34, 4, 12, 5, 2};
        int sum=9;
        System.out.println(subsetCalc(set,sum));
    }

    private static List<Integer> subsetCalc(int[] set, int sum) {
        int [][]dp=new int[set.length+1][sum+1];
        for(int i=0;i<=set.length;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<= set.length;i++){
            for (int j=1;j<=sum;j++){
                if(set[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else {
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-set[i-1]];
                }
            }
        }
        List<Integer>list=new ArrayList<>();
        int j=set.length-1;
        int i=0;
        while (i<0){
            if(i==0)
                break;
            if(dp[set.length][sum]!=dp[j][sum]){
                list.add(set[j]);
            }
            else
                j--;
        }
        return list;
    }
}
