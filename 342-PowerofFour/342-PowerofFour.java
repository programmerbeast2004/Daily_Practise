// Last updated: 8/16/2025, 2:59:43 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0)  return false;
        if (n == 1) return true;
        if (n % 4 != 0) return false;
        return isPowerOfFour(n / 4);
    }
}