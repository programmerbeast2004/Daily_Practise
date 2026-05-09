// Last updated: 5/9/2026, 11:25:43 AM
class Solution {

    // -------- Bob Pair (not strictly needed now, but kept clean) --------
    class PairAlice {
        int node;
        int parent;
        int time;
        int income;

        PairAlice(int n, int p, int t, int i) {
            node = n;
            parent = p;
            time = t;
            income = i;
        }
    }

    HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
    HashMap<Integer, Integer> bobt = new HashMap<>();
    int[] amount;
    int ans = Integer.MIN_VALUE;

    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        this.amount = amount;

        int n = amount.length;
        for (int i = 0; i < n; i++) {
            map.put(i, new HashSet<>());
        }

        for (int[] e : edges) {
            map.get(e[0]).add(e[1]);
            map.get(e[1]).add(e[0]);
        }

        // Step 1: Find Bob's path timings
        dfsBob(bob, -1, 0);

        // Step 2: Alice DFS to compute max income
        DFS();

        return ans;
    }

    // -------------------- BOB DFS (CORRECT & SAFE) --------------------
    // Stores timing ONLY on Bob -> 0 path
    public boolean dfsBob(int node, int parent, int time) {
        bobt.put(node, time);

        if (node == 0) return true;

        for (int nbr : map.get(node)) {
            if (nbr != parent) {
                if (dfsBob(nbr, node, time + 1)) {
                    return true;
                }
            }
        }

        // not on path to 0
        bobt.remove(node);
        return false;
    }

    // -------------------- ALICE DFS (ITERATIVE, CORRECT) --------------------
    public void DFS() {
        Stack<PairAlice> st = new Stack<>();
        st.push(new PairAlice(0, -1, 0, 0));

        while (!st.isEmpty()) {
            PairAlice r = st.pop();

            int currIncome = r.income;

            if (!bobt.containsKey(r.node) || r.time < bobt.get(r.node)) {
                currIncome += amount[r.node];
            } else if (r.time == bobt.get(r.node)) {
                currIncome += amount[r.node] / 2;
            }

            boolean leaf = true;

            for (int nbr : map.get(r.node)) {
                if (nbr != r.parent) {
                    leaf = false;
                    st.push(new PairAlice(nbr, r.node, r.time + 1, currIncome));
                }
            }

            if (leaf) {
                ans = Math.max(ans, currIncome);
            }
        }
    }
}
