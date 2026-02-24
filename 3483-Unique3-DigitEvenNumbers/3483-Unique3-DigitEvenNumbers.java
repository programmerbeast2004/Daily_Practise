// Last updated: 2/24/2026, 4:14:53 PM
1class Solution {
2    public int totalNumbers(int[] digits) {
3        HashSet<Integer> set = new HashSet<>();
4        int n = digits.length;
5
6        for (int i = 0; i < n; i++) {
7            for (int j = 0; j < n; j++) {
8                for (int k = 0; k < n; k++) {
9                    if (i != j && j != k && i != k) {
10                        int a = digits[i];
11                        int b = digits[j];
12                        int c = digits[k];
13
14                        // a != 0 ensures 3-digit number
15                        // c % 2 == 0 ensures even number
16                        if (a != 0 && c % 2 == 0) {
17                            int res = a * 100 + b * 10 + c;
18                            set.add(res);
19                        }
20                    }
21                }
22            }
23        }
24
25       return set.size();
26    }
27}