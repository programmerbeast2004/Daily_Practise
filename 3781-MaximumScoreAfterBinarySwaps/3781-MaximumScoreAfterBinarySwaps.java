// Last updated: 1/16/2026, 7:09:52 AM
1class Solution {
2    public long maximumScore(int[] nums, String s) {
3        int n=nums.length;
4        long sum=0;
5        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
6        for(int i=0;i<n;i++){
7            pq.offer(nums[i]);
8            if(s.charAt(i)=='1'){
9                sum+=pq.poll();
10            }
11        }
12        return sum;
13    }
14}