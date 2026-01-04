// Last updated: 1/4/2026, 11:37:05 PM
1class Solution {
2
3    static class Pair {
4        int node;
5        long dist;
6        Pair(int n, long d) {
7            node = n;
8            dist = d;
9        }
10    }
11
12    public int countPaths(int n, int[][] roads) {
13
14        int MOD = 1_000_000_007;
15
16        // Step 1: Build graph
17        List<List<Pair>> graph = new ArrayList<>();
18        for (int i = 0; i < n; i++) {
19            graph.add(new ArrayList<>());
20        }
21
22        for (int[] r : roads) {
23            int u = r[0];
24            int v = r[1];
25            int w = r[2];
26            graph.get(u).add(new Pair(v, w));
27            graph.get(v).add(new Pair(u, w));
28        }
29
30        // Step 2: Distance array
31        long[] dist = new long[n];
32        Arrays.fill(dist, Long.MAX_VALUE);
33        dist[0] = 0;
34
35        // Step 3: Ways array
36        int[] ways = new int[n];
37        ways[0] = 1;
38
39        // Step 4: Min-heap for Dijkstra
40        PriorityQueue<Pair> pq = new PriorityQueue<>(
41            (a, b) -> Long.compare(a.dist, b.dist)
42        );
43        pq.add(new Pair(0, 0));
44
45        // Step 5: Dijkstra
46        while (!pq.isEmpty()) {
47            Pair cur = pq.poll();
48            int node = cur.node;
49            long d = cur.dist;
50
51            // Skip outdated entry
52            if (d > dist[node]) continue;
53
54            for (Pair nbr : graph.get(node)) {
55                long newDist = d + nbr.dist;
56
57                // Found shorter path
58                if (newDist < dist[nbr.node]) {
59                    dist[nbr.node] = newDist;
60                    ways[nbr.node] = ways[node];
61                    pq.add(new Pair(nbr.node, newDist));
62                }
63                // Found another shortest path
64                else if (newDist == dist[nbr.node]) {
65                    ways[nbr.node] = (ways[nbr.node] + ways[node]) % MOD;
66                }
67            }
68        }
69
70        return ways[n - 1];
71    }
72}
73