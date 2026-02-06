// Last updated: 2/6/2026, 2:07:36 PM
1class Solution {
2    public int maxFrequency(int[] nums, int k) {
3        int max=0,ck=0;
4        int[] prefix=new int[51];
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==k){
7                ck++;
8                prefix[k]=max+1;
9            }
10            else{
11                prefix[nums[i]]=Math.max(prefix[nums[i]],ck)+1;
12            }
13            max=Math.max(max,prefix[nums[i]]);
14        }
15        return max;
16    }
17}