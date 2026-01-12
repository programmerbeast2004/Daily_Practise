// Last updated: 1/12/2026, 6:47:09 AM
1class Solution {
2    static class Pair{
3        int vtx;
4        int cost;
5        Pair(int vtx,int cost){
6            this.vtx=vtx;
7            this.cost=cost;
8        }
9    }
10    public int minimumEffortPath(int[][] heights) {
11        int n=heights.length;
12        int m=heights[0].length;
13
14        PriorityQueue<Pair> pq=new PriorityQueue<>(
15            (a,b)->a.cost-b.cost);
16        boolean[] visited=new boolean[m*n];
17
18        pq.add(new Pair(0,0));
19        int[] dr={1,-1,0,0};
20        int[] dc={0,0,1,-1};
21        while(!pq.isEmpty()){
22            //remove
23            Pair rp=pq.poll();
24            //ignore
25            if(visited[rp.vtx]) continue;
26            //mark
27            visited[rp.vtx]=true;
28            int r=rp.vtx/m;
29            int c=rp.vtx%m;
30            //self
31            if(r==n-1 &c==m-1){
32                return rp.cost;
33            }
34            //add nbrs
35            for(int k=0;k<4;k++){
36                int nr=r+dr[k];
37                int nc=c+dc[k];
38                if(nr>=0 && nc>=0 && nr<n && nc<m){
39                    int nbrvtx=nr*m+nc;
40                    if(!visited[nbrvtx]){
41                        int edgecost=Math.abs(heights[nr][nc]-heights[r][c]);
42                        int newcost=Math.max(edgecost,rp.cost);
43                        pq.add(new Pair(nbrvtx,newcost));
44                    }
45                }
46            }
47
48        }
49        return 0;
50    }
51}