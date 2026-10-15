// Last updated: 10/15/2026, 8:17:06 AM
1class Solution {
2    public int[] distinctDifferenceArray(int[] nums) {
3        HashMap<Integer,Integer>prefix=new HashMap<>();                HashMap<Integer,Integer>suffix=new HashMap<>();
4
5        int[]res=new int[nums.length];
6
7        for(int x:nums){
8            suffix.put(x,suffix.getOrDefault(x,0)+1);
9        }
10
11        for(int i=0;i<nums.length;i++){
12            Integer x=nums[i];
13            prefix.put(x,prefix.getOrDefault(x,0)+1);
14            suffix.put(x,suffix.get(x)-1);
15
16            if(suffix.get(x)==0){
17                suffix.remove(x);
18            }
19            res[i]=prefix.size()-suffix.size();
20        }
21        return res;
22
23    }
24}