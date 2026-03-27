// Last updated: 3/27/2026, 7:54:48 AM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int o=0,z=0;
4        for(int num:nums){
5            o=(o^num)&~z;
6            z=(z^num)&~o;
7        }
8        return o;
9    }
10}