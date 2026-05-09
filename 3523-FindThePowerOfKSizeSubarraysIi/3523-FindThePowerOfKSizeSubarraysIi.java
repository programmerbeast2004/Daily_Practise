// Last updated: 5/9/2026, 11:24:12 AM
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        int[] breaks = new int[n];
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                breaks[i] = 1;
            }
        }

        int[] prefix = new int[n];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + breaks[i];
        }

        for (int i = 0; i <= n - k; i++) {
            int start = i + 1;
            int end = i + k - 1;

            int broken = prefix[end] - prefix[start - 1];
            ans[i] = (broken == 0) ? nums[end] : -1;
        }

        return ans;
    }
}
