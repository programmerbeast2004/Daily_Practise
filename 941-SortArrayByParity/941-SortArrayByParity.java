// Last updated: 5/9/2026, 11:29:53 AM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int p=0;
        for(int i=0;i<n;i++){
            if((nums[i]%2)==0){
                ans[p]=nums[i];
                p++;
            }
        }
        for(int i=0;i<n;i++){
            if((nums[i]%2)!=0){
                ans[p]=nums[i];
                p++;
            }
        }
        return ans;
    }
}