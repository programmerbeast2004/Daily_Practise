// Last updated: 7/31/2025, 12:17:04 PM
class Solution {
    int ans = 0;

    public void left(int index, int candiesrem, int limit) {
        if (index == 3) {
            if (candiesrem == 0) {
                ans += 1;
            }
            return;
        }

        for (int i = 0; i <= Math.min(limit, candiesrem); i++) {
            left(index + 1, candiesrem - i, limit);
        }
    }

    public int distributeCandies(int n, int limit) {
        ans = 0;
        left(0, n, limit);
        return ans;
    }
}
