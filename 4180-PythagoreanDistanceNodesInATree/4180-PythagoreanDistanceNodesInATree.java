// Last updated: 5/9/2026, 11:22:36 AM
class Solution {
    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
        List<List<Integer>> g=new ArrayList<>();
        for(int i=0;i<n;i++){
            g.add(new ArrayList<>());
        }
        for(int[] e:edges){
            g.get(e[0]).add(e[1]);
            g.get(e[1]).add(e[0]);
        }
        int[] dx=bfs(g,n,x);
        int[] dy=bfs(g,n,y);
        int[] dz=bfs(g,n,z);
        int c=0;
        for(int i=0;i<n;i++){
            int[] d={dx[i],dy[i],dz[i]};
            Arrays.sort(d);
            if(d[0]*d[0]+d[1]*d[1]==d[2]*d[2]){
                c++;
            }
        }
        return c;
    }
    private int[] bfs(List<List<Integer>> g,int n,int st){
        int[] dist=new int[n];
        Arrays.fill(dist,-1);
        Queue<Integer>q=new LinkedList<>();
        q.add(st);
        dist[st]=0;
        while(!q.isEmpty()){
            int u=q.poll();
            for(int v:g.get(u)){
                if(dist[v]==-1){
                    dist[v]=dist[u]+1;
                    q.add(v);
                }
            }
        }
        return dist;
    }
}