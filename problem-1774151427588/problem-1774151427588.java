// Last updated: 3/22/2026, 9:20:27 AM
1class Solution {
2    public int minRemovals(int[] nums, int target) {
3        int t=0;
4        for(int x:nums)t^=x;
5        int need=t^target;
6        if(need==0) return 0;
7        Map<Integer,Integer>dp=new HashMap<>();
8        dp.put(0,0);
9        for(int num:nums){
10            Map<Integer,Integer>next=new HashMap<>(dp);
11            for(int xor:dp.keySet()){
12                int newXor=xor^num;
13                int newCount=dp.get(xor)+1;
14                next.put(newXor,Math.min(next.getOrDefault(newXor,Integer.MAX_VALUE),newCount));
15                
16            }
17            dp=next;
18        }
19        return dp.getOrDefault(need,-1);
20    }
21}