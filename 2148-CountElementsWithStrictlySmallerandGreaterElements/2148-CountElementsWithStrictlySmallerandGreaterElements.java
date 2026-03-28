// Last updated: 3/28/2026, 11:43:42 PM
1class Solution {
2    public int countElements(int[] nums) {
3        int min=Integer.MAX_VALUE;
4        int max=Integer.MIN_VALUE;
5        for(int num:nums){
6            min=Math.min(num,min);
7            max=Math.max(num,max);
8        }
9        int c=0;
10        for(int num:nums){
11            if(num>min && num<max){
12                c++;
13            }
14        }
15        return c++;
16    }
17}