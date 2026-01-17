// Last updated: 1/17/2026, 11:58:24 PM
1class Solution {
2    public int[] resultsArray(int[] nums, int k) {
3        int n = nums.length;
4        int[] ans = new int[n - k + 1];
5
6        int[] breaks = new int[n];
7        for (int i = 1; i < n; i++) {
8            if (nums[i] != nums[i - 1] + 1) {
9                breaks[i] = 1;
10            }
11        }
12
13        int[] prefix = new int[n];
14        for (int i = 1; i < n; i++) {
15            prefix[i] = prefix[i - 1] + breaks[i];
16        }
17
18        for (int i = 0; i <= n - k; i++) {
19            int start = i + 1;
20            int end = i + k - 1;
21
22            int broken = prefix[end] - prefix[start - 1];
23            ans[i] = (broken == 0) ? nums[end] : -1;
24        }
25
26        return ans;
27    }
28}
29