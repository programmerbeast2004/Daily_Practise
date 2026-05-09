// Last updated: 5/9/2026, 11:25:59 AM
class Solution {
    public int edgeScore(int[] edges) {
        int n=edges.length;
        HashMap<Integer,Long> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,0L);
        }
        for(int i=0;i<n;i++){
            int t=edges[i];
            map.put(t,map.get(t)+i);
        }
        int ans=0;
        long mx=Long.MIN_VALUE;
        for(int vtx=0;vtx<n;vtx++){
            long curr=map.get(vtx);
            if(curr>mx){
                mx=curr;
                ans=vtx;
            }
        }
        return ans;
    }
    class Pair {
        long sum;
        int vtx;

        Pair(long sum, int vtx) {
            this.sum = sum;
            this.vtx = vtx;
        }
    }
}