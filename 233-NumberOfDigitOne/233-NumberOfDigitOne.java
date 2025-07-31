// Last updated: 7/31/2025, 12:20:45 PM
class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        for (int i = 1; i <= n; i *= 10) {
            int divider = i * 10;
            count += (n / divider) * i + Math.min(Math.max(n % divider - i + 1, 0), i);
        }
        return count;
    }
}
