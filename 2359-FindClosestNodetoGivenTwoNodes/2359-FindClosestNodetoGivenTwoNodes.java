// Last updated: 12/30/2025, 11:16:32 PM
1class Solution {
2    public int closestMeetingNode(int[] edges, int node1, int node2) {
3        int n=edges.length;
4        int[] d1=dist(edges,node1);
5        int[] d2=dist(edges,node2);
6        int ans=-1;
7        int best=Integer.MAX_VALUE;
8        for(int i=0;i<n;i++){
9            if(d1[i]!=-1 && d2[i]!=-1){
10                int cur=Math.max(d1[i],d2[i]);
11                if(cur<best){
12                    best=cur;
13                    ans=i;
14                }
15            }
16        }
17        return ans;
18    }
19    private int[] dist(int[] e, int st){
20        int n=e.length;
21        int[] d=new int[n];
22        Arrays.fill(d,-1);
23        int cur=st,steps=0;
24        while(cur!=-1 && d[cur]==-1){
25            d[cur]=steps++;
26            cur=e[cur];
27        }
28        return d;
29    }
30}