// Last updated: 1/22/2026, 11:54:57 PM
1class Solution {
2    public int maximizeWin(int[] prizePositions, int k) {
3        int n = prizePositions.length;
4        int[] dp = new int[n];
5
6        int left = 0;
7        int max = 0;
8
9        for (int right = 0; right < n; right++) {
10            while (prizePositions[right] - prizePositions[left] > k) {
11                left++;
12            }
13
14            int window = right - left + 1;
15            dp[right] = Math.max(right > 0 ? dp[right - 1] : 0, window);
16        }
17
18        left = 0;
19        for (int right = 0; right < n; right++) {
20            while (prizePositions[right] - prizePositions[left] > k) {
21                left++;
22            }
23
24            int window = right - left + 1;
25            int prev = left > 0 ? dp[left - 1] : 0;
26            max = Math.max(max, window + prev);
27        }
28
29        return max;
30    }
31}
32