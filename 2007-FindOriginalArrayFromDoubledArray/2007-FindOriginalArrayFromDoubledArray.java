// Last updated: 1/16/2026, 11:56:05 PM
1import java.util.*;
2
3class Solution {
4    public int[] findOriginalArray(int[] changed) {
5        int n = changed.length;
6        if (n % 2 != 0) return new int[0];
7
8        Arrays.sort(changed);
9
10        Map<Integer, Integer> map = new HashMap<>();
11        for (int x : changed) {
12            map.put(x, map.getOrDefault(x, 0) + 1);
13        }
14
15        int[] res = new int[n / 2];
16        int idx = 0;
17
18        for (int x : changed) {
19            if (map.get(x) == 0) continue;
20
21            if (x == 0) {
22                if (map.get(0) < 2) return new int[0];
23                map.put(0, map.get(0) - 2);
24                res[idx++] = 0;
25                continue;
26            }
27
28            if (map.getOrDefault(2 * x, 0) == 0)
29                return new int[0];
30
31            res[idx++] = x;
32            map.put(x, map.get(x) - 1);
33            map.put(2 * x, map.get(2 * x) - 1);
34        }
35
36        return res;
37    }
38}
39