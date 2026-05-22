// Last updated: 5/22/2026, 9:24:34 AM
1class Solution {
2    public int specialArray(int[] nums) {
3        Arrays.sort(nums);
4        
5        int st=0;
6        int ed=nums.length;
7
8        while(st<=ed){
9            int mid=st+(ed-st)/2;
10            int ans=count(nums,mid);
11            if(ans==mid)return mid;
12            else if(ans>mid)st=mid+1;
13            else ed=mid-1;
14        }
15        return -1;
16    }
17    public int count(int[]nums,int target){
18        int ans=0;
19        for(int num:nums){
20            if(num>=target)ans++;
21        }
22        return ans;
23    }
24}