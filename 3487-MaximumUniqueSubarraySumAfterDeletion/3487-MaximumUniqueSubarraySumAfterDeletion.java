// Last updated: 10/24/2026, 12:26:23 PM
1class Solution {
2    public int maxSum(int[] nums) {
3        Set<Integer> set=new HashSet<>();
4        int sum=0;
5        int max=Integer.MIN_VALUE;
6
7        for(int num:nums){
8            max=Math.max(max,num);
9
10            if(num>0 && set.add(num)){
11                sum+=num;
12            }
13
14        }
15return sum>0 ?sum:max;
16
17    }
18}