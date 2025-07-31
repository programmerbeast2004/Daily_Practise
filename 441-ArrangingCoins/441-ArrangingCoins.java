// Last updated: 7/31/2025, 12:20:06 PM
class Solution {
    public int arrangeCoins(int n) {
        return (int)((Math.sqrt(1 + 8L * (long)n) - 1) / 2);
    }
}