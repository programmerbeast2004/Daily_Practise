// Last updated: 1/7/2026, 11:48:41 PM
1class Solution {
2    public boolean validPartition(int[] nums) {
3        int n = nums.length;
4        boolean[] dp = new boolean[n + 1];
5
6        dp[0] = true;
7
8        for (int i = 2; i <= n; i++) {
9
10            // Case 1: two equal elements
11            if (nums[i - 1] == nums[i - 2] && dp[i - 2]) {
12                dp[i] = true;
13            }
14
15            // Cases with 3 elements
16            if (i >= 3 && dp[i - 3]) {
17
18                // Case 2: three equal
19                if (nums[i - 1] == nums[i - 2] &&
20                    nums[i - 2] == nums[i - 3]) {
21                    dp[i] = true;
22                }
23
24                // Case 3: three consecutive
25                if (nums[i - 3] + 1 == nums[i - 2] &&
26                    nums[i - 2] + 1 == nums[i - 1]) {
27                    dp[i] = true;
28                }
29            }
30        }
31        return dp[n];
32    }
33}
34