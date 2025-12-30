// Last updated: 12/30/2025, 11:28:25 AM
1class Solution {
2    private int[][] g;
3    private boolean[] v;
4    public int findCircleNum(int[][] isConnected) {
5        g=isConnected;
6        int n=g.length;
7        v=new boolean[n];
8        int p=0;
9        for(int i=0;i<n;i++){
10            if(!v[i]){
11                dfs(i);
12                p++;
13            }
14        }
15        return p;
16    }
17    private void dfs(int curr){
18        v[curr]=true;
19        for(int next=0;next<g.length;next++){
20            while(!v[next] &&g[curr][next]==1){
21                dfs(next);
22            }
23        }
24    }
25}