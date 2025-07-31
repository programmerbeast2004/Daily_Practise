// Last updated: 7/31/2025, 12:18:04 PM
class Solution {
    public int countPairs(int[] nums, int k) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]&& (i*j)%k==0) ans++;
            }
        }
        return ans;
    }
}