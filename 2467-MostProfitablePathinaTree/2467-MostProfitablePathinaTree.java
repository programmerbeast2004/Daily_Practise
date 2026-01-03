// Last updated: 1/4/2026, 12:38:15 AM
1class Solution {
2
3    // -------- Bob Pair (not strictly needed now, but kept clean) --------
4    class PairAlice {
5        int node;
6        int parent;
7        int time;
8        int income;
9
10        PairAlice(int n, int p, int t, int i) {
11            node = n;
12            parent = p;
13            time = t;
14            income = i;
15        }
16    }
17
18    HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
19    HashMap<Integer, Integer> bobt = new HashMap<>();
20    int[] amount;
21    int ans = Integer.MIN_VALUE;
22
23    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
24        this.amount = amount;
25
26        int n = amount.length;
27        for (int i = 0; i < n; i++) {
28            map.put(i, new HashSet<>());
29        }
30
31        for (int[] e : edges) {
32            map.get(e[0]).add(e[1]);
33            map.get(e[1]).add(e[0]);
34        }
35
36        // Step 1: Find Bob's path timings
37        dfsBob(bob, -1, 0);
38
39        // Step 2: Alice DFS to compute max income
40        DFS();
41
42        return ans;
43    }
44
45    // -------------------- BOB DFS (CORRECT & SAFE) --------------------
46    // Stores timing ONLY on Bob -> 0 path
47    public boolean dfsBob(int node, int parent, int time) {
48        bobt.put(node, time);
49
50        if (node == 0) return true;
51
52        for (int nbr : map.get(node)) {
53            if (nbr != parent) {
54                if (dfsBob(nbr, node, time + 1)) {
55                    return true;
56                }
57            }
58        }
59
60        // not on path to 0
61        bobt.remove(node);
62        return false;
63    }
64
65    // -------------------- ALICE DFS (ITERATIVE, CORRECT) --------------------
66    public void DFS() {
67        Stack<PairAlice> st = new Stack<>();
68        st.push(new PairAlice(0, -1, 0, 0));
69
70        while (!st.isEmpty()) {
71            PairAlice r = st.pop();
72
73            int currIncome = r.income;
74
75            if (!bobt.containsKey(r.node) || r.time < bobt.get(r.node)) {
76                currIncome += amount[r.node];
77            } else if (r.time == bobt.get(r.node)) {
78                currIncome += amount[r.node] / 2;
79            }
80
81            boolean leaf = true;
82
83            for (int nbr : map.get(r.node)) {
84                if (nbr != r.parent) {
85                    leaf = false;
86                    st.push(new PairAlice(nbr, r.node, r.time + 1, currIncome));
87                }
88            }
89
90            if (leaf) {
91                ans = Math.max(ans, currIncome);
92            }
93        }
94    }
95}
96