// Last updated: 5/9/2026, 11:22:25 AM
class Solution {
    public int dominantIndices(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n-1;i++){
            double sum=0;
            for(int j=i+1;j<n;j++){
                sum+=nums[j];
            }
            double avg=sum/(n-i-1);
            if(nums[i]>avg){
                c++;
            }
        }
        return c;
    }
}