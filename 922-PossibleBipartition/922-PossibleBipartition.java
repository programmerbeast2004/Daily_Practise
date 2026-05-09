// Last updated: 5/9/2026, 11:29:58 AM
class Solution {
    class Pair{
        int vtx;
        int dis;
        Pair(int vtx, int dis){
            this.vtx=vtx;
            this.dis=dis;
        }
    }
    public boolean possibleBipartition(int n, int[][] dislikes) {
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            map.put(i,new HashSet<>());
        }
        for(int[] d:dislikes){
            map.get(d[0]).add(d[1]);
            map.get(d[1]).add(d[0]);
        }

        HashMap<Integer,Integer>visited=new HashMap<>();
        Queue<Pair> q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            if(visited.containsKey(i)) continue;
            q.add(new Pair(i,0));
            while(!q.isEmpty()){
                //1 remove
                Pair rp=q.poll();
                //2 ignore
                if(visited.containsKey(rp.vtx)){
                    if(rp.dis != visited.get(rp.vtx)) return false;
                    continue;
                }
                //3 mark visited
                visited.put(rp.vtx,rp.dis);
                //4 self work

                //5 add nbrs
                for(int nbrs:map.get(rp.vtx)){
                    if(!visited.containsKey(nbrs)){
                        q.add(new Pair(nbrs,rp.dis+1));
                    }
                }
            }
        }
        return true;

    }
}