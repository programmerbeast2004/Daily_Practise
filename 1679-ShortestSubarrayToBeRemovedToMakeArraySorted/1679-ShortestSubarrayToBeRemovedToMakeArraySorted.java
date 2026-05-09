// Last updated: 5/9/2026, 11:27:56 AM
class Solution {
    public int findLengthOfShortestSubarray(int[] a) {
        int n = a.length, l = 0, r = n - 1;

        while (l + 1 < n && a[l] <= a[l + 1]) l++;
        if (l == n - 1) return 0;
        while (r > 0 && a[r - 1] <= a[r]) r--;

        int ans = Math.min(n - l - 1, r);

        for (int i = 0, j = r; i <= l && j < n;)
            if (a[i] <= a[j]) ans = Math.min(ans, j - i++ - 1);
            else j++;

        return ans;
    }
}
