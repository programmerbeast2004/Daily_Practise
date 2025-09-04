// Last updated: 9/4/2025, 12:28:01 PM
class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(s, t, 0, 0, dp);
    }
    private int helper(String s, String t, int i, int j, int[][] dp) {
        if (j == t.length()) return 1;
        if (i == s.length()) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        int inc = 0, exc = 0;
        if (s.charAt(i) == t.charAt(j)) {
            inc = helper(s, t, i + 1, j + 1, dp);
        }
        exc = helper(s, t, i + 1, j, dp);
        return dp[i][j] = inc + exc;
    }
}
