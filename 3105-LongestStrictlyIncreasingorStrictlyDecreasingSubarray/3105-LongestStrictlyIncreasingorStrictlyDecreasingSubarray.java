// Last updated: 10/24/2026, 12:05:36 PM
1class Solution {
2    public int longestMonotonicSubarray(int[] nums) {
3        int inc=1,dec=1,ans=1;
4
5        for(int i=1;i<nums.length;i++){
6            if(nums[i]>nums[i-1]){
7                inc++;
8            }
9            else{
10                inc=1;
11            }
12
13            if(nums[i]<nums[i-1]){
14                dec++;
15            }
16            else{
17                dec=1;
18            }
19
20            ans=Math.max(ans,Math.max(inc,dec));
21        }
22
23        return ans;
24    }
25}