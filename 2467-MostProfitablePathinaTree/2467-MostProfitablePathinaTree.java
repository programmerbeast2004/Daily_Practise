// Last updated: 1/3/2026, 11:56:31 PM
1class Solution {
2    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
3        ArrayList<Integer>[] graph = new ArrayList[amount.length];
4        for (int i = 0; i < graph.length; i++) graph[i] = new ArrayList<>();
5        for (int[] edge : edges) {
6            graph[edge[0]].add(edge[1]);
7            graph[edge[1]].add(edge[0]);
8        }
9
10        int[] bobPath = new int[amount.length];
11        Arrays.fill(bobPath, -1);
12        ArrayList<Integer> path = new ArrayList<>();
13        fillBobPath(bob, -1, path, graph);
14        
15        for (int i = 0; i < path.size(); i++) {
16            bobPath[path.get(i)] = i;
17        }
18
19        return getAliceMaxScore(0, -1, 0, bobPath, graph, 0, amount);
20    }
21
22    private boolean fillBobPath(int node, int parentNode, ArrayList<Integer> path, ArrayList<Integer>[] graph) {
23        if (node == 0) return true;
24        for (int neighborNode : graph[node]) {
25            if (neighborNode != parentNode) {
26                path.add(node);
27                if (fillBobPath(neighborNode, node, path, graph)) return true;
28                path.remove(path.size() - 1);
29            }
30        }
31        return false;
32    }
33
34    private int getAliceMaxScore(int node, int parentNode, int currScore, int[] bobPath, ArrayList<Integer>[] graph, int timestamp, int[] amount) {
35        if (bobPath[node] == -1 || bobPath[node] > timestamp) {
36            currScore += amount[node];
37        } else if (bobPath[node] == timestamp) {
38            currScore += amount[node] / 2;
39        }
40        if (graph[node].size() == 1 && node != 0) return currScore;
41        int maxScore = Integer.MIN_VALUE;
42        for (int neighborNode : graph[node]) {
43            if (neighborNode != parentNode) {
44                maxScore = Math.max(maxScore, getAliceMaxScore(neighborNode, node, currScore, bobPath, graph, timestamp + 1, amount));
45            }
46        }
47        return maxScore;
48    }
49}