// Last updated: 1/22/2026, 11:43:51 PM
1class Solution {
2    static final long MOD = 1_000_000_007;
3
4    public int monkeyMove(int n) {
5        long ans = 1, base = 2;
6        while (n > 0) {
7            if ((n & 1) == 1) ans = ans * base % MOD;
8            base = base * base % MOD;
9            n >>= 1;
10        }
11        return (int)((ans - 2 + MOD) % MOD);
12    }
13}
14