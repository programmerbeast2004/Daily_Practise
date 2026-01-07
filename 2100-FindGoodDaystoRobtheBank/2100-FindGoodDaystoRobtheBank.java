// Last updated: 1/7/2026, 11:25:30 PM
1class Solution {
2    public List<Integer> goodDaysToRobBank(int[] security, int time) {
3        List<Integer> res=new ArrayList<>();
4        int n=security.length;
5        int[] l =new int[n];
6        int[] r= new int[n];
7        for(int i=1;i<n;i++){
8            if(security[i]<=security[i-1]){
9                l[i]=l[i-1]+1;
10            }
11        }
12        for(int i=n-2;i>=0;i--){
13            if(security[i]<=security[i+1]){
14                r[i]=r[i+1]+1;
15            }
16        }
17        for(int i=time;i<n-time;i++){
18            if(l[i]>=time && r[i]>=time){
19                res.add(i);
20            }
21        }
22        return res;
23    }
24}