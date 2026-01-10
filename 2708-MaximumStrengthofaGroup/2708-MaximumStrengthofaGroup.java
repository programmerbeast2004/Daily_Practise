// Last updated: 1/10/2026, 10:41:26 PM
1class Solution {
2    public long maxStrength(int[] nums) {
3
4        long product = 1;
5        int negCount = 0;
6        int nonZeroCount = 0;
7        int maxNeg = Integer.MIN_VALUE;
8        boolean hasZero = false;
9
10        for (int x : nums) {
11            if (x == 0) {
12                hasZero = true;
13                continue;
14            }
15
16            nonZeroCount++;
17            product *= x;
18
19            if (x < 0) {
20                negCount++;
21                maxNeg = Math.max(maxNeg, x);
22            }
23        }
24
25        if (nonZeroCount == 0) return 0;
26
27        if (nonZeroCount == 1 && product < 0) {
28            return hasZero ? 0 : product;
29        }
30
31        if (negCount % 2 == 1) {
32            product /= maxNeg;
33        }
34
35        return product;
36    }
37}
38