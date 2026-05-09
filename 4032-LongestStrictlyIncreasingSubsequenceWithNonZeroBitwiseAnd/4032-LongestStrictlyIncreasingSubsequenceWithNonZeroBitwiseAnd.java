// Last updated: 5/9/2026, 11:23:28 AM
class Solution {
    public int longestSubsequence(int[] nums) {
        int ans = 0;

        for (int b = 0; b < 32; b++) {
            int[] tail = new int[nums.length];
            int size = 0;

            for (int x : nums) {
                if (((x >> b) & 1) == 0) continue;

                int l = 0, r = size;
                while (l < r) {
                    int m = (l + r) / 2;
                    if (tail[m] < x) l = m + 1;
                    else r = m;
                }
                tail[l] = x;
                if (l == size) size++;
            }

            ans = Math.max(ans, size);
        }

        return ans;
    }
}
