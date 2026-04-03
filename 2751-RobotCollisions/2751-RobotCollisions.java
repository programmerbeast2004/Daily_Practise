// Last updated: 4/3/2026, 8:37:04 AM
1class Solution {
2    public List<Integer> survivedRobotsHealths(int[] pos, int[] h, String d) {
3        int n=pos.length;
4        Integer[]idx=new Integer[n];
5        for(int i=0;i<n;i++)idx[i]=i;
6
7        Arrays.sort(idx,(a,b)->pos[a]-pos[b]);
8
9        boolean[]alive=new boolean[n];
10        Arrays.fill(alive,true);
11
12        Deque<Integer>st=new ArrayDeque<>();
13
14        for(int i:idx){
15            if(d.charAt(i)=='R'){
16                st.push(i);
17            }
18            else{
19                while(!st.isEmpty()){
20                    int top=st.peek();
21                    if (h[top] < h[i]) {
22                        alive[top]=false;
23                        st.pop();     // R dies
24                        h[i]--;       // L loses 1
25                    }
26                    else if (h[top] > h[i]) {
27                        alive[i]=false;
28                        h[top]--;       // R loses 1
29                        break;    // L dies
30                    }
31                    else {
32                        alive[top]=false;
33                        alive[i]=false;
34                        st.pop();     // both die
35                        break;
36                    }
37                }
38            }
39        }
40        List<Integer>res=new ArrayList<>();
41        for(int i=0;i<n;i++) if(alive[i]) res.add(h[i]);
42        return res;
43    }
44}