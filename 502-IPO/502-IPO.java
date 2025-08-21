// Last updated: 8/21/2025, 11:34:40 AM
import java.util.*;
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;

        // Min-heap: stores projects by required capital
        PriorityQueue<int[]> minCapital = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        // Max-heap: stores projects by profit
        PriorityQueue<int[]> maxProfit = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        // Push all projects into minCapital heap
        for (int i = 0; i < n; i++) {
            minCapital.offer(new int[]{capital[i], profits[i]});
        }

        // Pick at most k projects
        for (int i = 0; i < k; i++) {
            // Move all projects you can afford into maxProfit heap
            while (!minCapital.isEmpty() && minCapital.peek()[0] <= w) {
                int[] proj = minCapital.poll();
                maxProfit.offer(proj);
            }

            // If no projects can be started, stop
            if (maxProfit.isEmpty()) break;

            // Pick the most profitable project
            w += maxProfit.poll()[1];
        }

        return w;
    }
}
