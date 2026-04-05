// Last updated: 4/5/2026, 9:26:28 AM
1class Solution {
2    public int minOperations(int[] nums, int k) {
3        int n = nums.length;
4        if (k == 0)
5            return 0;
6        if (k > n / 2)
7            return -1;
8        int[] cost = new int[n];
9        for (int i = 0; i < n; i++) {
10            int l = nums[(i - 1 + n) % n];
11            int r = nums[(i + 1) % n];
12            int need = Math.max(l, r) + 1;
13            cost[i] = Math.max(0, need - nums[i]);
14        }
15        int ans1 = com(cost, 0, n - 2, k);
16        int ans2 = com(cost, 1, n - 1, k);
17        int res = Math.min(ans1, ans2);
18        return res >= Integer.MAX_VALUE / 2 ? -1 : res;
19
20    }
21
22    private int com(int[] cost, int st, int ed, int k) {
23        int len = ed - st + 1;
24        int[][] dp = new int[len + 2][k + 1];
25
26        for(int i=0;i<len+2;i++){
27            Arrays.fill(dp[i],Integer.MAX_VALUE/2);
28        }
29        dp[0][0] = 0;
30        for (int i = 0; i < len; i++) {
31            for (int j = 0; j <= k; j++) {
32                dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j]);
33
34                if (j + 1 <= k) {
35                    dp[i + 2][j + 1] = Math.min(dp[i + 2][j + 1], dp[i][j] + cost[st + i]);
36                }
37            }
38        }
39        return Math.min(dp[len][k],dp[len+1][k]);
40    }
41}