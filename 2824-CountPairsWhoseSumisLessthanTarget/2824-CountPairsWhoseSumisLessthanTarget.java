// Last updated: 1/20/2026, 1:48:28 AM
1class Solution {
2    public int countPairs(List<Integer> nums, int target) {
3        Collections.sort(nums);
4        int l=0,r=nums.size()-1;
5        int ans=0;
6        while(l<r){
7            if(nums.get(l)+nums.get(r)<target){
8                ans+=(r-l);
9                l++;
10            }
11            else{
12                r--;
13            }
14        }
15        return ans;
16    }
17}