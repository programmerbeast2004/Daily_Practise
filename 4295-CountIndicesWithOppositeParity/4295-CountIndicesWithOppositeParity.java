// Last updated: 5/9/2026, 11:21:49 AM
class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n=nums.length;
        int[]ans=new int[n];
        int ec=0;
        int oc=0;
        for(int i=n-1;i>=0;i--){
            if(nums[i]%2==0){
                ans[i]=oc;
                ec++;
            }
            else{
                ans[i]=ec;
                oc++;
            }
        }
        return ans;
    }
}