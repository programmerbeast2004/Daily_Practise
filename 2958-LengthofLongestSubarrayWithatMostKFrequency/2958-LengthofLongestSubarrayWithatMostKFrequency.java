// Last updated: 8/14/2026, 1:39:27 AM
1class Solution {
2    public int maxSubarrayLength(int[] nums, int k) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        int i=0,j=0;
5        int res=0;
6        while(j<nums.length){
7            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
8            while(map.get(nums[j])>k){
9                map.put(nums[i],map.get(nums[i])-1);
10                i++;
11            }
12            res=Math.max(res,j-i+1);
13            j++;
14        }
15        return res;
16    }
17}