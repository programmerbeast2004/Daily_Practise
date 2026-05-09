// Last updated: 5/9/2026, 11:26:58 AM
import java.util.*;

class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) return new int[0];

        Arrays.sort(changed);

        Map<Integer, Integer> map = new HashMap<>();
        for (int x : changed) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int[] res = new int[n / 2];
        int idx = 0;

        for (int x : changed) {
            if (map.get(x) == 0) continue;

            if (x == 0) {
                if (map.get(0) < 2) return new int[0];
                map.put(0, map.get(0) - 2);
                res[idx++] = 0;
                continue;
            }

            if (map.getOrDefault(2 * x, 0) == 0)
                return new int[0];

            res[idx++] = x;
            map.put(x, map.get(x) - 1);
            map.put(2 * x, map.get(2 * x) - 1);
        }

        return res;
    }
}
