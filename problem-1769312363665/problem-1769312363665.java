// Last updated: 1/25/2026, 9:09:23 AM
1class Solution {
2    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
3        List<List<Integer>> g=new ArrayList<>();
4        for(int i=0;i<n;i++){
5            g.add(new ArrayList<>());
6        }
7        for(int[] e:edges){
8            g.get(e[0]).add(e[1]);
9            g.get(e[1]).add(e[0]);
10        }
11        int[] dx=bfs(g,n,x);
12        int[] dy=bfs(g,n,y);
13        int[] dz=bfs(g,n,z);
14        int c=0;
15        for(int i=0;i<n;i++){
16            int[] d={dx[i],dy[i],dz[i]};
17            Arrays.sort(d);
18            if(d[0]*d[0]+d[1]*d[1]==d[2]*d[2]){
19                c++;
20            }
21        }
22        return c;
23    }
24    private int[] bfs(List<List<Integer>> g,int n,int st){
25        int[] dist=new int[n];
26        Arrays.fill(dist,-1);
27        Queue<Integer>q=new LinkedList<>();
28        q.add(st);
29        dist[st]=0;
30        while(!q.isEmpty()){
31            int u=q.poll();
32            for(int v:g.get(u)){
33                if(dist[v]==-1){
34                    dist[v]=dist[u]+1;
35                    q.add(v);
36                }
37            }
38        }
39        return dist;
40    }
41}