// Last updated: 11/18/2025, 5:29:12 AM
class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n=nums.length;
        long[]pre=new long[n+1];
        for(int i=0;i<n;i++){
            pre[i+1]=pre[i]+nums[i];
        }
        Deque<Integer> dq=new ArrayDeque<>();
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<=n;j++){
            while(!dq.isEmpty()&& pre[j]-pre[dq.peekFirst()]>=k){
                ans=Math.min(ans,j-dq.peekFirst());
                dq.pollFirst();
            }
            while(!dq.isEmpty()&&pre[j]<=pre[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(j);
        }
        return ans==Integer.MAX_VALUE ? -1:ans;
    }
}