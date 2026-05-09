// Last updated: 5/9/2026, 11:29:41 AM
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int currsum=0;
            for(int j=i;j<n;j++){
                currsum+=nums[j];
                if(currsum==goal){
                    c++;
                }
            }
        }
        return c;
    }
}