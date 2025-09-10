// Last updated: 9/10/2025, 11:59:14 AM
class Solution {
    private int[][] dp;

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        // Initialize dp with -1 to indicate uncalculated states
        dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        
        return minimumPath(grid, 0, 0);
    }
    
    private int minimumPath(int[][] grid, int cr, int cc) {
        int m = grid.length;
        int n = grid[0].length;
        
        // Base case: if we are at the bottom-right corner
        if (cr == m - 1 && cc == n - 1) {
            return grid[cr][cc];
        }
        
        // If out of bounds
        if (cr >= m || cc >= n) {
            return Integer.MAX_VALUE;
        }
        
        // If already calculated
        if (dp[cr][cc] != -1) {
            return dp[cr][cc];
        }
        
        // Move right and down
        int right = minimumPath(grid, cr, cc + 1);
        int down = minimumPath(grid, cr + 1, cc);
        
        // Store and return the minimum path sum from this cell
        dp[cr][cc] = grid[cr][cc] + Math.min(right, down);
        return dp[cr][cc];
    }
}
