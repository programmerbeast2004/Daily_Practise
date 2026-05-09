// Last updated: 5/9/2026, 11:22:53 AM
class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer,Integer> idx=new HashMap<>();
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++){
            int x=nums[j];
            if(idx.containsKey(x)){
                int i=idx.get(x);
                ans=Math.min(ans,j-i);
            }
            int r=reverse(x);
            idx.put(r,j);
        }
        return ans==Integer.MAX_VALUE ? -1:ans;
    }
    private int reverse(int x){
        int r=0;
        while(x>0){
            r=r*10+x%10;
            x/=10;
        }
        return r;
    }
}