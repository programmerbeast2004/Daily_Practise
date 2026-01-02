// Last updated: 1/2/2026, 11:15:05 PM
1class Solution {
2    public int edgeScore(int[] edges) {
3        int n=edges.length;
4        HashMap<Integer,Long> map=new HashMap<>();
5        for(int i=0;i<n;i++){
6            map.put(i,0L);
7        }
8        for(int i=0;i<n;i++){
9            int t=edges[i];
10            map.put(t,map.get(t)+i);
11        }
12        int ans=0;
13        long mx=Long.MIN_VALUE;
14        for(int vtx=0;vtx<n;vtx++){
15            long curr=map.get(vtx);
16            if(curr>mx){
17                mx=curr;
18                ans=vtx;
19            }
20        }
21        return ans;
22    }
23    class Pair {
24        long sum;
25        int vtx;
26
27        Pair(long sum, int vtx) {
28            this.sum = sum;
29            this.vtx = vtx;
30        }
31    }
32}