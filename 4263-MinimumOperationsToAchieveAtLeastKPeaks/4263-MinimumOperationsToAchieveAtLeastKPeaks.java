// Last updated: 5/9/2026, 11:22:16 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        if (k == 0)
            return 0;
        if (k > n / 2)
            return -1;
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            int l = nums[(i - 1 + n) % n];
            int r = nums[(i + 1) % n];
            int need = Math.max(l, r) + 1;
            cost[i] = Math.max(0, need - nums[i]);
        }
        int ans1 = com(cost, 0, n - 2, k);
        int ans2 = com(cost, 1, n - 1, k);
        int res = Math.min(ans1, ans2);
        return res >= Integer.MAX_VALUE / 2 ? -1 : res;

    }

    private int com(int[] cost, int st, int ed, int k) {
        int len = ed - st + 1;
        int[][] dp = new int[len + 2][k + 1];

        for(int i=0;i<len+2;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE/2);
        }
        dp[0][0] = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j]);

                if (j + 1 <= k) {
                    dp[i + 2][j + 1] = Math.min(dp[i + 2][j + 1], dp[i][j] + cost[st + i]);
                }
            }
        }
        return Math.min(dp[len][k],dp[len+1][k]);
    }
}