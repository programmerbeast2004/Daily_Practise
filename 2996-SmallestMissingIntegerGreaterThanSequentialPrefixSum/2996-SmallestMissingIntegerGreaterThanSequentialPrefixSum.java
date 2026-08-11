// Last updated: 8/11/2026, 4:55:27 PM
1class Solution {
2    public int missingInteger(int[] nums) {
3        int s=nums[0];
4        for(int i=1;i<nums.length;i++){
5            if(nums[i]==nums[i-1]+1){
6                s+=nums[i];
7            }
8            else{
9                break;
10            }
11            
12        }
13        while(contains(nums,s)){
14            s++;
15        }
16        return s;
17    }
18    private boolean contains(int[] nums,int sum){
19        for(int num:nums){
20            if(num==sum){
21                return true;
22            }
23        }
24        return false;
25    }
26}