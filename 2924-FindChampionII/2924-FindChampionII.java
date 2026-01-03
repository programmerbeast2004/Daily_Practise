// Last updated: 1/3/2026, 3:27:48 PM
1class Solution {
2    public int findChampion(int n, int[][] edges) {
3        int[] in=new int[n];
4        for(int[] e:edges){
5            int f=e[0];
6            int t=e[1];
7            in[t]++;
8        }
9        int ans=0;
10        int c=0;
11        for(int i=0;i<n;i++){
12            if(in[i]==0){
13               c++;
14               if(c == 2) return -1;
15                ans = i;
16            }
17        }
18        return ans;
19    }
20}