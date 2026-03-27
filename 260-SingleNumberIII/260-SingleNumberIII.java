// Last updated: 3/27/2026, 8:13:12 AM
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        HashMap<Integer,Integer>map=new HashMap<>();
4        for(int num:nums){
5            map.put(num,map.getOrDefault(num,0)+1);
6        }
7            int[] res=new int[2];
8            int i=0;
9            for(int key:map.keySet()){
10                if(map.get(key)==1){
11                    res[i++]=key;
12                }
13            }
14        return res;
15
16    }
17}