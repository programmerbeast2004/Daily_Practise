// Last updated: 7/31/2025, 12:17:49 PM
class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int lastv=-1;
        int lastmax=-1;
        int lastmin=-1;
        long c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK){
                lastv=i;
            }
            if(nums[i]==maxK){
                lastmax=i;
            }
            if(nums[i]==minK){
                lastmin=i;
            }
            int minl=Math.min(lastmin,lastmax);
            if(minl>lastv){
                c+=minl-lastv;
            }
        }
        return c;
    }
}