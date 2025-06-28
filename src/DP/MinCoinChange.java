package DP;

import java.util.ArrayList;
import java.util.List;

public class MinCoinChange {
    static List<Integer> coinChange(int [] coins, int target){
        int n = coins.length;
        int[][] dp = new int[n+1][target+1];

        // Initialize the dp table
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0; // It takes 0 coins to make amount 0
        }

        // Set the value for all other amounts to be max value initially
        for (int j = 1; j <= target; j++) {
            dp[0][j] = Integer.MAX_VALUE - 1; // Impossible to make the amount with 0 coins
        }

        // Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (coins[i-1] <= j) {
                    dp[i][j] = Math.min(dp[i-1][j], 1 + dp[i][j-coins[i-1]]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        // If dp[n][target] is still max value, it means no solution was found
        if (dp[n][target] == Integer.MAX_VALUE - 1) {
            return new ArrayList<>(); // No solution
        }

        // Backtrack to find which coins were used
        List<Integer> coinUsed = new ArrayList<>();
        int t = n;
        int tar = target;

        while (tar > 0) {
            // If current dp value is different from the previous row, it means we used the coin coins[t-1]
            if (dp[t][tar] != dp[t-1][tar]) {
                coinUsed.add(coins[t-1]);
                tar -= coins[t-1]; // Reduce the target by the coin value
            } else {
                t--; // Otherwise, move to the previous row
            }
        }

        return coinUsed;
    }

    public static void main(String[] args) {
        int[] coins = {1, 5, 6, 9};
        List<Integer> coinsUsed = coinChange(coins, 10);
        System.out.println("Coins used to make target 10: " + coinsUsed);
    }
}
