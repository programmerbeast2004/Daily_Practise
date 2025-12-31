// Last updated: 12/31/2025, 11:43:08 AM
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        Map<Integer,List<Integer>> g=new HashMap<>();
4        for(int[] e:edges){
5            int u=e[0];
6            int v=e[1];
7            g.computeIfAbsent(u,k-> new ArrayList<>()).add(v);
8            g.computeIfAbsent(v,k-> new ArrayList<>()).add(u);
9
10        }
11        Set<Integer>vis=new HashSet<>();
12        return dfs(source,destination,g,vis);
13
14    }
15    private boolean dfs(int s, int d,Map<Integer,List<Integer>> g,Set<Integer> v){
16        if(s==d) return true;
17        v.add(s);
18        for(int n:g.getOrDefault(s,new ArrayList<>())){
19            if(!v.contains(n)){
20                if(dfs(n,d,g,v)){
21                    return true;
22                }
23            }
24        }
25        return false;
26    }
27}