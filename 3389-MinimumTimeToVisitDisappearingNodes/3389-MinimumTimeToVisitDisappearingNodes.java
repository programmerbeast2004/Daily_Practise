// Last updated: 5/9/2026, 11:24:27 AM
class Solution {

    static class Pair {
        int node;
        int time;

        Pair(int node, int time) {
            this.node = node;
            this.time = time;
        }
    }

    public int[] minimumTime(int n, int[][] edges, int[] disappear) {

        // Build graph
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int[] e : edges) {
            graph.get(e[0]).add(new int[]{e[1], e[2]});
            graph.get(e[1]).add(new int[]{e[0], e[2]});
        }

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);

        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        PriorityQueue<Pair> pq =
                new PriorityQueue<>(Comparator.comparingInt(a -> a.time));

        // Start at node 0
        if (0 < disappear[0]) {
            dist[0] = 0;
            pq.add(new Pair(0, 0));
        }

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();

            // 1️⃣ outdated entry
            if (cur.time > dist[cur.node]) continue;

            // 2️⃣ node already disappeared
            if (cur.time >= disappear[cur.node]) continue;

            // 3️⃣ valid shortest time
            ans[cur.node] = cur.time;

            // 4️⃣ relax neighbors
            for (int[] nbr : graph.get(cur.node)) {
                int next = nbr[0];
                int wt = nbr[1];
                int newTime = cur.time + wt;

                if (newTime < dist[next] && newTime < disappear[next]) {
                    dist[next] = newTime;
                    pq.add(new Pair(next, newTime));
                }
            }
        }

        return ans;
    }
}
