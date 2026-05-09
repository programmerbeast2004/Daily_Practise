// Last updated: 5/9/2026, 11:31:19 AM
class Solution {
    private int[][] g;
    private boolean[] v;
    public int findCircleNum(int[][] isConnected) {
        g=isConnected;
        int n=g.length;
        v=new boolean[n];
        int p=0;
        for(int i=0;i<n;i++){
            if(!v[i]){
                dfs(i);
                p++;
            }
        }
        return p;
    }
    private void dfs(int curr){
        v[curr]=true;
        for(int next=0;next<g.length;next++){
            while(!v[next] &&g[curr][next]==1){
                dfs(next);
            }
        }
    }
}