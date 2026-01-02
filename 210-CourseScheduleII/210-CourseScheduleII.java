// Last updated: 1/2/2026, 3:37:37 PM
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
4        for (int i = 0; i < numCourses; i++) {
5            map.put(i, new HashSet<>());
6        }
7        int[] in = new int[map.size()];
8        for (int[] pre : prerequisites) {
9            int c = pre[0];
10            int p = pre[1];
11            map.get(p).add(c);
12            in[c]++;
13        }
14        Queue<Integer> pq=new LinkedList<>();
15        for(int i=0;i<in.length;i++){
16            if(in[i]==0){
17                pq.add(i);
18            }
19        }
20        int[] ans=new int[numCourses];
21        int idx=0;
22        while(!pq.isEmpty()){
23            int rp=pq.poll();
24            ans[idx++]=rp;
25            for(int nbrs:map.get(rp)){
26                in[nbrs]--;
27                if(in[nbrs]==0){
28                    pq.add(nbrs);
29                }
30            }
31        }
32        if(idx!=numCourses){
33            return new int[0];
34        }
35        return ans;
36
37
38
39    }
40}