// Last updated: 12/29/2025, 2:56:55 PM
1class Solution {
2    public int findLengthOfShortestSubarray(int[] a) {
3        int n = a.length, l = 0, r = n - 1;
4
5        while (l + 1 < n && a[l] <= a[l + 1]) l++;
6        if (l == n - 1) return 0;
7        while (r > 0 && a[r - 1] <= a[r]) r--;
8
9        int ans = Math.min(n - l - 1, r);
10
11        for (int i = 0, j = r; i <= l && j < n;)
12            if (a[i] <= a[j]) ans = Math.min(ans, j - i++ - 1);
13            else j++;
14
15        return ans;
16    }
17}
18