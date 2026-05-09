// Last updated: 5/9/2026, 11:27:02 AM
class Solution {

    static class Pair {
        int node;
        long dist;
        Pair(int n, long d) {
            node = n;
            dist = d;
        }
    }

    public int countPaths(int n, int[][] roads) {

        int MOD = 1_000_000_007;

        // Step 1: Build graph
        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] r : roads) {
            int u = r[0];
            int v = r[1];
            int w = r[2];
            graph.get(u).add(new Pair(v, w));
            graph.get(v).add(new Pair(u, w));
        }

        // Step 2: Distance array
        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;

        // Step 3: Ways array
        int[] ways = new int[n];
        ways[0] = 1;

        // Step 4: Min-heap for Dijkstra
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> Long.compare(a.dist, b.dist)
        );
        pq.add(new Pair(0, 0));

        // Step 5: Dijkstra
        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            int node = cur.node;
            long d = cur.dist;

            // Skip outdated entry
            if (d > dist[node]) continue;

            for (Pair nbr : graph.get(node)) {
                long newDist = d + nbr.dist;

                // Found shorter path
                if (newDist < dist[nbr.node]) {
                    dist[nbr.node] = newDist;
                    ways[nbr.node] = ways[node];
                    pq.add(new Pair(nbr.node, newDist));
                }
                // Found another shortest path
                else if (newDist == dist[nbr.node]) {
                    ways[nbr.node] = (ways[nbr.node] + ways[node]) % MOD;
                }
            }
        }

        return ways[n - 1];
    }
}
