// Last updated: 1/19/2026, 9:22:34 AM
1class Solution {
2
3    //Greatest Common Divisor
4    private long gcd(long a, long b) {
5        while (b != 0) {
6            long t = a % b;
7            a = b;
8            b = t;
9        }
10        return a;
11    }
12
13    //Build the smallest number of given lengt digit product is divisible by `req`
14    private String buildSuffix(long req, int length) {
15        StringBuilder sb = new StringBuilder();
16
17        // Use large digits first to reduce number of digits
18        for (int d = 9; d >= 2; d--) {
19            while (req % d == 0) {
20                sb.append(d);
21                req /= d;
22            }
23        }
24
25        // Fill remaining positions with 1 (doesn't affect product)
26        while (sb.length() < length) {
27            sb.append('1');
28        }
29
30        // Reverse to get smallest lexicographical number
31        return sb.reverse().toString();
32    }
33
34    //Check if T can be formed using digits 1–9
35    private boolean isValidT(long T) {
36        for (int p : new int[]{2, 3, 5, 7}) {
37            while (T % p == 0) T /= p;
38        }
39        return T == 1;
40    }
41
42    public String smallestNumber(String S, long T) {
43        int N = S.length();
44
45        // STEP 1: If T contains invalid prime factors → impossible
46        if (!isValidT(T)) return "-1";
47
48        /* -----------------------------------------------------
49           STEP 2: Prefix array
50           P[i] = remaining product requirement after using
51                  digits S[0..i-1]
52           ----------------------------------------------------- */
53        long[] P = new long[N + 1];
54        P[0] = T;
55
56        for (int i = 0; i < N; i++) {
57            int digit = S.charAt(i) - '0';
58
59            // Zero breaks digit product
60            if (digit == 0) break;
61
62            P[i + 1] = P[i] / gcd(P[i], digit);
63        }
64
65        // STEP 3: If original number already satisfies T
66        if (P[N] == 1) return S;
67
68        /* -----------------------------------------------------
69           STEP 4: Try fixing the number from RIGHT → LEFT
70                   (smallest possible increase)
71           ----------------------------------------------------- */
72
73        // Find first zero (zero must be replaced)
74        int zeroIndex = S.indexOf('0');
75        if (zeroIndex == -1) zeroIndex = N;
76
77        // IMPORTANT: start from zeroIndex (NOT zeroIndex - 1)
78        for (int i = zeroIndex; i >= 0; i--) {
79
80            long required = P[i];               // remaining product
81            int suffixLen = N - 1 - i;          // digits after i
82
83            int startDigit = (i < N)
84                    ? (S.charAt(i) - '0') + 1   // must be greater
85                    : 1;
86
87            for (int d = startDigit; d <= 9; d++) {
88
89                long newReq = required / gcd(required, d);
90                String suffix = buildSuffix(newReq, suffixLen);
91
92                if (suffix.length() <= suffixLen) {
93                    return S.substring(0, i) + d + suffix;
94                }
95            }
96        }
97
98        /* -----------------------------------------------------
99           STEP 5: Same length impossible → increase length
100           ----------------------------------------------------- */
101        return buildSuffix(T, N + 1);
102    }
103}
104