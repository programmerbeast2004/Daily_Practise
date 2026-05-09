// Last updated: 5/9/2026, 11:27:48 AM
class Solution {
    static class Pair{
        int vtx;
        int cost;
        Pair(int vtx,int cost){
            this.vtx=vtx;
            this.cost=cost;
        }
    }
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;

        PriorityQueue<Pair> pq=new PriorityQueue<>(
            (a,b)->a.cost-b.cost);
        boolean[] visited=new boolean[m*n];

        pq.add(new Pair(0,0));
        int[] dr={1,-1,0,0};
        int[] dc={0,0,1,-1};
        while(!pq.isEmpty()){
            //remove
            Pair rp=pq.poll();
            //ignore
            if(visited[rp.vtx]) continue;
            //mark
            visited[rp.vtx]=true;
            int r=rp.vtx/m;
            int c=rp.vtx%m;
            //self
            if(r==n-1 &c==m-1){
                return rp.cost;
            }
            //add nbrs
            for(int k=0;k<4;k++){
                int nr=r+dr[k];
                int nc=c+dc[k];
                if(nr>=0 && nc>=0 && nr<n && nc<m){
                    int nbrvtx=nr*m+nc;
                    if(!visited[nbrvtx]){
                        int edgecost=Math.abs(heights[nr][nc]-heights[r][c]);
                        int newcost=Math.max(edgecost,rp.cost);
                        pq.add(new Pair(nbrvtx,newcost));
                    }
                }
            }

        }
        return 0;
    }
}