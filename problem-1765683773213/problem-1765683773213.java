// Last updated: 12/14/2025, 9:12:53 AM
1class Solution {
2    public long minMoves(int[] balance) {
3        long sum=0;
4        for(int x:balance) sum+=x;
5        if(sum<0)return -1;
6        int n=balance.length;
7        int idx=-1;
8        for(int i=0;i<n;i++){
9            if(balance[i]<0){
10                idx=i;
11                break;
12            }
13        }
14        if(idx==-1) return 0;
15        long req=-balance[idx];
16
17        List<int[]>list=new ArrayList<>();
18        for(int i=0;i<n;i++){
19            if(balance[i]>0){
20                int d=Math.abs(i-idx);
21                int dist=Math.min(d,n-d);
22                list.add(new int[]{dist,balance[i]});
23            }
24        }
25        Collections.sort(list,(a,b)->a[0]-b[0]);
26        long ans=0;
27        for(int[] p:list){
28            if(req==0) break;
29            long take=Math.min((long)p[1],req);
30            ans+=take*p[0];
31            req-=take;
32        }
33        return ans;
34    }
35}