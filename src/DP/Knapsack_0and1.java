package DP;
import java.util.Arrays;
public class Knapsack_0and1 {
    public static void main(String[] args) {
        int [] weights={3,4,6,5};
        int [] profits={2,3,1,4};
        System.out.println("Profits : "+Arrays.toString(profits)+"\t");
        System.out.println("Weights : "+Arrays.toString(weights)+"\t");
        int Weightsaloowed=8,n=4;
        System.out.println(knapsack(weights,profits,Weightsaloowed,n));
    }

    private static int knapsack(int[] weights, int[] profits, int weightsaloowed, int n) {
        int [][] dp=new int [weights.length+1][weightsaloowed+1];
        int [] selection=new int[n];
        for(int i=0;i<=weights.length;i++){
            dp[i][0]=0;
        }
        for(int i=1;i<=weightsaloowed;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=weights.length;i++){
            for (int j=1;j<=weightsaloowed;j++){
                if(weights[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else {
                    dp[i][j]=Math.max(dp[i-1][j],profits[i-1]+dp[i-1][j-weights[i-1]]);
                }
            }
        }
        int i=n,j=weightsaloowed;
        while(i>0 && j>0){
            if(dp[i][j]!=dp[i-1][j]){
                selection[i-1]=1;
               j=j-weights[i-1];
            }
            i--;
        }
        System.out.println("Items select 0: not 1 yes : ");
        System.out.print(Arrays.toString(selection));
        return dp[weights.length][weightsaloowed];
    }
}
