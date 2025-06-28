package DP;

public class Subset {
    public static boolean subsetCalc(int [] set,int sum){
        boolean [][]dp=new boolean[set.length+1][sum+1];
        for(int i=0;i<=set.length;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<=set.length;i++){
            for (int j=1;j<=sum;j++){
                if(set[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else {
                    dp[i][j]=dp[i-1][j]||dp[i-1][j-set[i-1]];
                }
            }
        }
        return dp[set.length][sum];
    }
    public static void main(String[] args) {
        int[]set={3, 34, 4, 12, 5, 2};
        int sum=9;
        System.out.println(subsetCalc(set,sum));
    }
}
