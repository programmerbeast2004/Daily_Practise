// Last updated: 1/1/2026, 8:24:27 AM
1class Solution {
2    static final int MOD = 1000000007;
3    List<int[]>[] g;
4    int[] dis;
5    Integer[] dp;
6    
7    public int countRestrictedPaths(int n, int[][] edges) {
8        g=new ArrayList[n+1];
9        for(int i=1;i<=n;i++) g[i]=new ArrayList<>();
10        for(int[] e:edges){
11            g[e[0]].add(new int[]{e[1],e[2]});
12            g[e[1]].add(new int[]{e[0],e[2]});
13        }
14        dijkstra(n,n);
15        dp=new Integer[n+1];
16        return dfs(1,n);    
17    }
18    public void dijkstra(int src, int n){
19        dis=new int[n+1];
20        Arrays.fill(dis,Integer.MAX_VALUE);
21        dis[src]=0;
22        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[1]));
23        pq.offer(new int[]{src,0});
24        while(!pq.isEmpty()){
25            int[] c=pq.poll();
26            for(int[] nb:g[c[0]]){
27                if(dis[nb[0]]>c[1]+nb[1]){
28                    dis[nb[0]]=c[1]+nb[1];
29                    pq.offer(new int[]{nb[0],dis[nb[0]]});
30                }
31            }
32        }
33    }
34    public int dfs(int u, int n){
35        if(u==n) return 1;
36        if(dp[u]!=null) return dp[u];
37        int res=0;
38        for(int[]nb:g[u]){
39            if(dis[u]>dis[nb[0]]){
40                res=(res+dfs(nb[0],n))%MOD;
41            }
42        }
43        return dp[u]=res;
44    }
45}