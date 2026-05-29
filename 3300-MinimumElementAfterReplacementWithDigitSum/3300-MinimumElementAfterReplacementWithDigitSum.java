// Last updated: 5/29/2026, 11:54:35 PM
1class Solution {
2    public int minElement(int[] nums) {
3        int min=Integer.MAX_VALUE;
4        for(int num: nums){
5            min=Math.min(min,ds(num));
6        }
7        return min;
8
9
10
11    }
12    public int ds(int n){
13        int sum=0;
14        while(n>0){
15            sum+=n%10;
16            n/=10;
17        }
18        return sum;
19    }
20}