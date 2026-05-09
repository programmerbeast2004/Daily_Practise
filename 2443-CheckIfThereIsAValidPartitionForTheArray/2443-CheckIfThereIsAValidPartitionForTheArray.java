// Last updated: 5/9/2026, 11:26:04 AM
class Solution {
    public boolean validPartition(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n + 1];

        dp[0] = true;

        for (int i = 2; i <= n; i++) {

            // Case 1: two equal elements
            if (nums[i - 1] == nums[i - 2] && dp[i - 2]) {
                dp[i] = true;
            }

            // Cases with 3 elements
            if (i >= 3 && dp[i - 3]) {

                // Case 2: three equal
                if (nums[i - 1] == nums[i - 2] &&
                    nums[i - 2] == nums[i - 3]) {
                    dp[i] = true;
                }

                // Case 3: three consecutive
                if (nums[i - 3] + 1 == nums[i - 2] &&
                    nums[i - 2] + 1 == nums[i - 1]) {
                    dp[i] = true;
                }
            }
        }
        return dp[n];
    }
}
