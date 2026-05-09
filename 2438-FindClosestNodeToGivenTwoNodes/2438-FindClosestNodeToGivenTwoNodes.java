// Last updated: 5/9/2026, 11:26:05 AM
class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n=edges.length;
        int[] d1=dist(edges,node1);
        int[] d2=dist(edges,node2);
        int ans=-1;
        int best=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(d1[i]!=-1 && d2[i]!=-1){
                int cur=Math.max(d1[i],d2[i]);
                if(cur<best){
                    best=cur;
                    ans=i;
                }
            }
        }
        return ans;
    }
    private int[] dist(int[] e, int st){
        int n=e.length;
        int[] d=new int[n];
        Arrays.fill(d,-1);
        int cur=st,steps=0;
        while(cur!=-1 && d[cur]==-1){
            d[cur]=steps++;
            cur=e[cur];
        }
        return d;
    }
}