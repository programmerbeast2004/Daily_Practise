// Last updated: 2/22/2026, 8:11:45 AM
1class Solution {
2    public int scoreDifference(int[] nums) {
3        int p1=0;
4        int p2=0;
5        boolean f=true;
6        for(int i=0;i<nums.length;i++){
7            if(nums[i]%2==1){
8                f=!f;
9            }
10            if(i%6==5){
11                f=!f;
12            }
13            if(f){
14                p1+=nums[i];
15            }
16            else{
17                p2+=nums[i];
18            }
19        }
20        return p1-p2;
21    }
22}