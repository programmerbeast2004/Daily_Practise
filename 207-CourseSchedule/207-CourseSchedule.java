// Last updated: 1/2/2026, 11:21:46 AM
1class Solution {
2    List<List<Integer>> g;
3    int[] state;
4    public boolean canFinish(int numCourses, int[][] prerequisites) {
5        g=new ArrayList<>();
6        for(int i=0;i<numCourses;i++){
7            g.add(new ArrayList<>());
8        }
9        for(int[] p:prerequisites){
10            int c=p[0];
11            int pr=p[1];
12            g.get(pr).add(c);
13        }
14        state=new int[numCourses];
15
16        for(int i=0;i<numCourses;i++){
17            if(dfs(i)){
18                return false;
19            }
20        }
21        return true;
22    }
23    private boolean dfs(int node){
24        if(state[node]==1) return true;
25        if(state[node]==2) return false;
26        state[node]=1;
27        for(int nt:g.get(node)){
28            if(dfs(nt)){
29             return true;
30            }
31        }
32        state[node]=2;
33        return false;
34    }
35}