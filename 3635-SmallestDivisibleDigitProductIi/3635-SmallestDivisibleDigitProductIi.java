// Last updated: 5/9/2026, 11:24:11 AM
class Solution {

    // gcd helper
    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // build smallest suffix with given length and required product
    private String build(long req, int len) {
        StringBuilder sb = new StringBuilder();

        // use big digits to reduce count
        for (int d = 9; d >= 2; d--) {
            while (req % d == 0) {
                sb.append(d);
                req /= d;
            }
        }

        // fill rest with 1
        while (sb.length() < len) sb.append('1');

        return sb.reverse().toString();
    }

    public String smallestNumber(String s, long t) {
        int n = s.length();

        // 1️⃣ check if t is possible
        long tmp = t;
        for (int p : new int[]{2, 3, 5, 7})
            while (tmp % p == 0) tmp /= p;
        if (tmp != 1) return "-1";

        // 2️⃣ prefix remaining product
        long[] need = new long[n + 1];
        need[0] = t;

        for (int i = 0; i < n; i++) {
            int d = s.charAt(i) - '0';
            if (d == 0) break;
            need[i + 1] = need[i] / gcd(need[i], d);
        }

        // already valid
        if (need[n] == 1) return s;

        // 3️⃣ fix from right to left (including zero)
        int z = s.indexOf('0');
        if (z == -1) z = n;

        for (int i = z; i >= 0; i--) {
            long req = need[i];
            int left = n - 1 - i;

            for (int d = (i < n ? s.charAt(i) - '0' + 1 : 1); d <= 9; d++) {
                String suf = build(req / gcd(req, d), left);
                if (suf.length() <= left)
                    return s.substring(0, i) + d + suf;
            }
        }

        // 4️⃣ increase length
        return build(t, n + 1);
    }
}
