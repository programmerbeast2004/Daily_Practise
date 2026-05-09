// Last updated: 5/9/2026, 11:30:26 AM
class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<BipartitePair>q=new LinkedList<>();
        HashMap<Integer, Integer>visited=new HashMap<>();
        for(int i=0;i<graph.length;i++){
            if(visited.containsKey(i)){
                continue;
            }
            q.add(new BipartitePair(i,0));
            while(!q.isEmpty()){
                //1.remove
                BipartitePair rp=q.poll();
                //ignore
                if(visited.containsKey(rp.vtx)){
                    if(visited.get(rp.vtx)!=rp.dis){
                        return false;
                    }
                    continue;
                }
                visited.put(rp.vtx,rp.dis);
                for(int nbrs:graph[rp.vtx]){
                    if(!visited.containsKey(nbrs)){
                        q.add(new BipartitePair(nbrs,rp.dis+1));
                    }
                }

            }
        }
        return true;
    }
}
class BipartitePair{
    int vtx;
    int dis;
    public BipartitePair(int vtx,int dis){
        this.vtx=vtx;
        this.dis=dis;
    }
}