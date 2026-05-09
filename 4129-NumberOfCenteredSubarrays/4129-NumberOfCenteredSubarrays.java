// Last updated: 5/9/2026, 11:22:59 AM
class Solution {
    public int centeredSubarrays(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++){
                s+=nums[j];
                for(int k=i;k<=j;k++){
                    if(nums[k]==s){
                        c++;
                        break;
                    }
                }
            }
        }
        return c;
    }
}