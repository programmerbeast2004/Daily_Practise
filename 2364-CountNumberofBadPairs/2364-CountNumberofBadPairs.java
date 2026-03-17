// Last updated: 3/17/2026, 12:10:02 PM
1class Solution {
2    public long countBadPairs(int[] nums) {
3        int n=nums.length;
4        long t=(long)n*(n-1)/2;
5        long g=0;
6        HashMap<Integer,Integer> map=new HashMap<>();
7        for(int i=0;i<n;i++){
8            int v=nums[i]-i;
9            if(map.containsKey(v)){
10                g+=map.get(v);
11            }
12            map.put(v,map.getOrDefault(v,0)+1);
13        }
14        return t-g;
15
16    }
17}