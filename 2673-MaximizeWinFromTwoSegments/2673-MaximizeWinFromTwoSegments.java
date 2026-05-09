// Last updated: 5/9/2026, 11:25:28 AM
class Solution {
    public int maximizeWin(int[] prizePositions, int k) {
        int n = prizePositions.length;
        int[] dp = new int[n];

        int left = 0;
        int max = 0;

        for (int right = 0; right < n; right++) {
            while (prizePositions[right] - prizePositions[left] > k) {
                left++;
            }

            int window = right - left + 1;
            dp[right] = Math.max(right > 0 ? dp[right - 1] : 0, window);
        }

        left = 0;
        for (int right = 0; right < n; right++) {
            while (prizePositions[right] - prizePositions[left] > k) {
                left++;
            }

            int window = right - left + 1;
            int prev = left > 0 ? dp[left - 1] : 0;
            max = Math.max(max, window + prev);
        }

        return max;
    }
}
