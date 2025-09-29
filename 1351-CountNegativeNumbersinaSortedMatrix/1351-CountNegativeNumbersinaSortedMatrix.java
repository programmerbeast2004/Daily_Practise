// Last updated: 9/29/2025, 2:35:52 PM
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