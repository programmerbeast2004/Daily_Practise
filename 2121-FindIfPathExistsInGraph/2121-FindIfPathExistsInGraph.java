// Last updated: 5/9/2026, 11:26:56 AM
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,List<Integer>> g=new HashMap<>();
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            g.computeIfAbsent(u,k-> new ArrayList<>()).add(v);
            g.computeIfAbsent(v,k-> new ArrayList<>()).add(u);

        }
        Set<Integer>vis=new HashSet<>();
        return dfs(source,destination,g,vis);

    }
    private boolean dfs(int s, int d,Map<Integer,List<Integer>> g,Set<Integer> v){
        if(s==d) return true;
        v.add(s);
        for(int n:g.getOrDefault(s,new ArrayList<>())){
            if(!v.contains(n)){
                if(dfs(n,d,g,v)){
                    return true;
                }
            }
        }
        return false;
    }
}