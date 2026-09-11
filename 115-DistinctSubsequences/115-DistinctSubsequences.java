// Last updated: 9/11/2026, 10:20:01 AM
1class Solution {
2    public int numDistinct(String s, String t) {
3        int n = s.length();
4        int m = t.length();
5        int[][] dp = new int[n][m];
6        for (int[] row : dp) {
7            Arrays.fill(row, -1);
8        }
9        return helper(s, t, 0, 0, dp);
10    }
11    private int helper(String s, String t, int i, int j, int[][] dp) {
12        if (j == t.length()) return 1;
13        if (i == s.length()) return 0;
14        if (dp[i][j] != -1) return dp[i][j];
15        int inc = 0, exc = 0;
16        if (s.charAt(i) == t.charAt(j)) {
17            inc = helper(s, t, i + 1, j + 1, dp);
18        }
19        exc = helper(s, t, i + 1, j, dp);
20        return dp[i][j] = inc + exc;
21    }
22}
23