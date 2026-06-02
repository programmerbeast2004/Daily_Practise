// Last updated: 6/2/2026, 10:17:06 AM
1class Solution {
2    public int minimumCost(int[] cost) {
3        int s=0;
4        Arrays.sort(cost);
5        for(int i=cost.length-1;i>=0;i-=3){
6            s+=cost[i];
7            if(i>0){
8                s+=cost[i-1];
9            }
10            
11        }
12        return s;
13    }
14}