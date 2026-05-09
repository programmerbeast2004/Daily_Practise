// Last updated: 5/9/2026, 11:23:09 AM
class Solution {
    public int minRemovals(int[] nums, int target) {
        int t=0;
        for(int x:nums)t^=x;
        int need=t^target;
        if(need==0) return 0;
        Map<Integer,Integer>dp=new HashMap<>();
        dp.put(0,0);
        for(int num:nums){
            Map<Integer,Integer>next=new HashMap<>(dp);
            for(int xor:dp.keySet()){
                int newXor=xor^num;
                int newCount=dp.get(xor)+1;
                next.put(newXor,Math.min(next.getOrDefault(newXor,Integer.MAX_VALUE),newCount));
                
            }
            dp=next;
        }
        return dp.getOrDefault(need,-1);
    }
}