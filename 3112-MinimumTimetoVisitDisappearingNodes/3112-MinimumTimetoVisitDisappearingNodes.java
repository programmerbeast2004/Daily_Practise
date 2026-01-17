// Last updated: 1/17/2026, 11:35:44 PM
1class Solution {
2
3    static class Pair {
4        int node;
5        int time;
6
7        Pair(int node, int time) {
8            this.node = node;
9            this.time = time;
10        }
11    }
12
13    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
14
15        // Build graph
16        List<List<int[]>> graph = new ArrayList<>();
17        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
18
19        for (int[] e : edges) {
20            graph.get(e[0]).add(new int[]{e[1], e[2]});
21            graph.get(e[1]).add(new int[]{e[0], e[2]});
22        }
23
24        int[] dist = new int[n];
25        Arrays.fill(dist, Integer.MAX_VALUE);
26
27        int[] ans = new int[n];
28        Arrays.fill(ans, -1);
29
30        PriorityQueue<Pair> pq =
31                new PriorityQueue<>(Comparator.comparingInt(a -> a.time));
32
33        // Start at node 0
34        if (0 < disappear[0]) {
35            dist[0] = 0;
36            pq.add(new Pair(0, 0));
37        }
38
39        while (!pq.isEmpty()) {
40            Pair cur = pq.poll();
41
42            // 1️⃣ outdated entry
43            if (cur.time > dist[cur.node]) continue;
44
45            // 2️⃣ node already disappeared
46            if (cur.time >= disappear[cur.node]) continue;
47
48            // 3️⃣ valid shortest time
49            ans[cur.node] = cur.time;
50
51            // 4️⃣ relax neighbors
52            for (int[] nbr : graph.get(cur.node)) {
53                int next = nbr[0];
54                int wt = nbr[1];
55                int newTime = cur.time + wt;
56
57                if (newTime < dist[next] && newTime < disappear[next]) {
58                    dist[next] = newTime;
59                    pq.add(new Pair(next, newTime));
60                }
61            }
62        }
63
64        return ans;
65    }
66}
67