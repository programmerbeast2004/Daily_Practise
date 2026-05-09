// Last updated: 5/9/2026, 11:25:27 AM
class Solution {
    static final long MOD = 1_000_000_007;

    public int monkeyMove(int n) {
        long ans = 1, base = 2;
        while (n > 0) {
            if ((n & 1) == 1) ans = ans * base % MOD;
            base = base * base % MOD;
            n >>= 1;
        }
        return (int)((ans - 2 + MOD) % MOD);
    }
}
