// Last updated: 1/31/2026, 9:07:49 PM
1class Solution {
2    public int longestSubsequence(int[] nums) {
3        int ans = 0;
4
5        for (int b = 0; b < 32; b++) {
6            int[] tail = new int[nums.length];
7            int size = 0;
8
9            for (int x : nums) {
10                if (((x >> b) & 1) == 0) continue;
11
12                int l = 0, r = size;
13                while (l < r) {
14                    int m = (l + r) / 2;
15                    if (tail[m] < x) l = m + 1;
16                    else r = m;
17                }
18                tail[l] = x;
19                if (l == size) size++;
20            }
21
22            ans = Math.max(ans, size);
23        }
24
25        return ans;
26    }
27}
28