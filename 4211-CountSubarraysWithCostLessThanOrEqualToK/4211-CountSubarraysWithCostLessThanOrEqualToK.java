// Last updated: 5/9/2026, 11:22:29 AM
class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n=nums.length;
        Deque<Integer> maxD=new ArrayDeque<>();
        Deque<Integer>minD=new ArrayDeque<>();
        long ans=0;
        int l=0;
        for(int r=0;r<n;r++){
            while(!maxD.isEmpty() && nums[maxD.peekLast()]<=nums[r]){
                maxD.pollLast();
            }
            maxD.addLast(r);
            while(!minD.isEmpty() && nums[minD.peekLast()]>=nums[r]){
                minD.pollLast();
            }
            minD.addLast(r);
            while(!maxD.isEmpty() && !minD.isEmpty()&& (long)(nums[maxD.peekFirst()]-nums[minD.peekFirst()])*(r-l+1)>k){
                if(maxD.peekFirst()==l)maxD.pollFirst();
                if(minD.peekFirst()==l)minD.pollFirst();
                l++;
            }
          ans+=(r-l+1);  
        }
        return ans;
    }
}