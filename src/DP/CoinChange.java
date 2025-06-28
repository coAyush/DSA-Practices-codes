package DP;

public class CoinChange {
    public static int coins(int [] coins,int target){
       int n=coins.length;
       int [][] dp=new int[n+1][target+1];
       for(int i=0;i<=n;i++){
           dp[i][0]=1;
       }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                if(coins[i-1]>j){
                    dp[i][j]=dp[i-1][j];

                }
                else {
                    dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
                }
            }
        }
        return dp[n][target];
    }
    public static void main(String[] args) {
        int target=4;
        int [] s={1,2,3};
        int ways=coins(s,target);
        System.out.println(ways);
    }
}
