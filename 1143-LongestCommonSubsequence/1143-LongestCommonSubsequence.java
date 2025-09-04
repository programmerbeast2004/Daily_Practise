// Last updated: 9/4/2025, 11:35:34 AM
class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount + 1][coins.length + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return Coin_Change(coins, amount, 0, dp);
    }
    public int Coin_Change(int[] coins, int amount, int i, int[][] dp) {
        if (amount == 0) return 1;  
        if (i == coins.length) return 0;

        if (dp[amount][i] != -1) return dp[amount][i];  // Already computed

        int inc = 0, exc = 0;

        // Include coin[i]
        if (amount >= coins[i]) {
            inc = Coin_Change(coins, amount - coins[i], i, dp);
        }

        // Exclude coin[i]
        exc = Coin_Change(coins, amount, i + 1, dp);

        return dp[amount][i] = inc + exc;
    }
}
