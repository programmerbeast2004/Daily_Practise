// Last updated: 5/9/2026, 11:27:26 AM
class Solution {
    static final int MOD = 1000000007;
    List<int[]>[] g;
    int[] dis;
    Integer[] dp;
    
    public int countRestrictedPaths(int n, int[][] edges) {
        g=new ArrayList[n+1];
        for(int i=1;i<=n;i++) g[i]=new ArrayList<>();
        for(int[] e:edges){
            g[e[0]].add(new int[]{e[1],e[2]});
            g[e[1]].add(new int[]{e[0],e[2]});
        }
        dijkstra(n,n);
        dp=new Integer[n+1];
        return dfs(1,n);    
    }
    public void dijkstra(int src, int n){
        dis=new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[src]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[1]));
        pq.offer(new int[]{src,0});
        while(!pq.isEmpty()){
            int[] c=pq.poll();
            for(int[] nb:g[c[0]]){
                if(dis[nb[0]]>c[1]+nb[1]){
                    dis[nb[0]]=c[1]+nb[1];
                    pq.offer(new int[]{nb[0],dis[nb[0]]});
                }
            }
        }
    }
    public int dfs(int u, int n){
        if(u==n) return 1;
        if(dp[u]!=null) return dp[u];
        int res=0;
        for(int[]nb:g[u]){
            if(dis[u]>dis[nb[0]]){
                res=(res+dfs(nb[0],n))%MOD;
            }
        }
        return dp[u]=res;
    }
}