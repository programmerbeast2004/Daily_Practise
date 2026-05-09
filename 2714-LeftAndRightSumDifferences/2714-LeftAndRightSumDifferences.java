// Last updated: 5/9/2026, 11:25:23 AM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int s=0,s2=0;
        int[] res=new int[nums.length];
        for(int i:nums){
            s+=i;
        }
        for(int i=0;i<nums.length;i++){
            int r=s-nums[i]-s2;
            int l=s2;
            res[i]=Math.abs(r-l);
            s2+=nums[i];
        }
        return res;
    }
}