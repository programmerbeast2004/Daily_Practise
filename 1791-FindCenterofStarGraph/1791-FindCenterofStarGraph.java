// Last updated: 1/1/2026, 5:16:02 AM
1class Solution {
2    public int findCenter(int[][] edges) {
3        int f0=edges[0][0];
4        int f1=edges[0][1];
5        int s0=edges[1][0];
6        int s1=edges[1][1];
7
8        if(f0==s0 || f0==s1){
9            return f0;
10        }
11        else{
12            return f1;
13        }
14    }
15}