// Last updated: 3/31/2026, 7:49:36 AM
1class Solution {
2    public int findLengthOfLCIS(int[] nums) {
3        int n=nums.length;
4        if(n==1){
5            return 1;
6        }
7        int count=0,c=1;
8        for(int i=1;i<n;i++){
9            if(nums[i]>nums[i-1]){
10                c++;
11            }
12            else{
13                c=1;
14            }
15            if(c>count){
16                count=c;
17            }
18        }
19        return count;
20    }
21}