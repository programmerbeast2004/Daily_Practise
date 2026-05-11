// Last updated: 5/11/2026, 7:43:42 PM
1class Solution {
2    public boolean canAliceWin(int[] nums) {
3        int s=0;
4        int d=0;
5        for(int num:nums){
6            if(num<10){
7                s+=num;
8            }
9            else{
10                d+=num;
11            }
12        }
13        if(s==d){
14            return false;
15        }
16        return true;
17    }
18}