// Last updated: 5/9/2026, 11:22:58 AM
class Solution {
    public long maximumScore(int[] nums, String s) {
        int n=nums.length;
        long sum=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<n;i++){
            pq.offer(nums[i]);
            if(s.charAt(i)=='1'){
                sum+=pq.poll();
            }
        }
        return sum;
    }
}