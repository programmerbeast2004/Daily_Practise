// Last updated: 1/13/2026, 11:44:25 AM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            if(map.containsKey(nums[i])){
6                if(i-map.get(nums[i])<=k){
7                    return true;
8                }
9            }
10            map.put(nums[i],i);
11        }
12        return false;
13    }
14}