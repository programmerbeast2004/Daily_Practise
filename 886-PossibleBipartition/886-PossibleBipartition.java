// Last updated: 1/3/2026, 12:12:06 PM
1class Solution {
2    class Pair{
3        int vtx;
4        int dis;
5        Pair(int vtx, int dis){
6            this.vtx=vtx;
7            this.dis=dis;
8        }
9    }
10    public boolean possibleBipartition(int n, int[][] dislikes) {
11        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
12        for(int i=1;i<=n;i++){
13            map.put(i,new HashSet<>());
14        }
15        for(int[] d:dislikes){
16            map.get(d[0]).add(d[1]);
17            map.get(d[1]).add(d[0]);
18        }
19
20        HashMap<Integer,Integer>visited=new HashMap<>();
21        Queue<Pair> q=new LinkedList<>();
22        for(int i=1;i<=n;i++){
23            if(visited.containsKey(i)) continue;
24            q.add(new Pair(i,0));
25            while(!q.isEmpty()){
26                //1 remove
27                Pair rp=q.poll();
28                //2 ignore
29                if(visited.containsKey(rp.vtx)){
30                    if(rp.dis != visited.get(rp.vtx)) return false;
31                    continue;
32                }
33                //3 mark visited
34                visited.put(rp.vtx,rp.dis);
35                //4 self work
36
37                //5 add nbrs
38                for(int nbrs:map.get(rp.vtx)){
39                    if(!visited.containsKey(nbrs)){
40                        q.add(new Pair(nbrs,rp.dis+1));
41                    }
42                }
43            }
44        }
45        return true;
46
47    }
48}