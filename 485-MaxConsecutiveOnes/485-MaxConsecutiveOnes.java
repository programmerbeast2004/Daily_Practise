// Last updated: 3/26/2026, 2:59:28 AM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int c=0;
4        int max=0;
5        for(int num:nums){
6            if(num==1){
7                c++;
8                max=Math.max(max,c);
9            }
10            else{
11                c=0;
12            }
13        }
14        return max;
15    }
16}