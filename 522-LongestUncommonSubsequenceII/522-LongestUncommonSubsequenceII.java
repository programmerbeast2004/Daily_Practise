// Last updated: 10/21/2026, 4:38:59 PM
1
2class Solution {
3    public int findLUSlength(String[] strs) {
4        int n = strs.length;
5        int ans = -1;
6
7        for (int i = 0; i < n; i++) {
8            boolean un = true;
9
10            for (int j = 0; j < n; j++) {
11                if (i == j) {
12                    continue;
13                }
14
15                if (isSub(strs[i], strs[j])) {
16                    un = false;
17                    break;
18                }
19            }
20
21            if (un) {
22                ans = Math.max(ans, strs[i].length());
23            }
24        }
25
26        return ans;
27    }
28
29    private boolean isSub(String a, String b) {
30        int i = 0;
31        int j = 0;
32
33        while (i < a.length() && j < b.length()) {
34            if (a.charAt(i) == b.charAt(j)) {
35                i++;
36            }
37            j++;
38        }
39
40        return i == a.length();
41    }
42}
43