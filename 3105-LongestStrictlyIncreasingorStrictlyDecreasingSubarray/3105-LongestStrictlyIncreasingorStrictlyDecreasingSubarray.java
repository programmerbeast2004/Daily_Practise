// Last updated: 10/24/2026, 12:08:39 PM
1class Solution {
2    public int longestMonotonicSubarray(int[] nums) {
3        int inc=1,dec=1,ans=1;
4
5        for(int i=1;i<nums.length;i++){
6            if(nums[i]>nums[i-1]){
7                inc++;
8                dec=1;
9            }
10
11            else if(nums[i]<nums[i-1]){
12                dec++;
13                inc=1;
14            }
15            else{
16                dec=1;
17                inc=1;
18            }
19
20            ans=Math.max(ans,Math.max(inc,dec));
21        }
22
23        return ans;
24    }
25}