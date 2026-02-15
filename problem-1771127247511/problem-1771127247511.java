// Last updated: 2/15/2026, 9:17:27 AM
1class Solution {
2    public int firstUniqueFreq(int[] nums) {
3        Map<Integer,Integer>a=new HashMap<>();
4        for(int num:nums){
5            a.put(num,a.getOrDefault(num,0)+1);
6        }
7        Map<Integer,Integer>b=new HashMap<>();
8        for(int freq:a.values()){
9            b.put(freq,b.getOrDefault(freq,0)+1);
10        }
11        for(int num:nums){
12            int freq=a.get(num);
13            if(b.get(freq)==1){
14                return num;
15            }
16        }
17        return -1;
18    }
19}