// Last updated: 5/9/2026, 11:24:17 AM
class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<=n-3;i++){
            if(nums[i]==0){
                nums[i]^=1;
                nums[i+1]^=1;
                nums[i+2]^=1;
                c++;
            }
        }
        for(int i=n-2;i<n;i++){
            if(nums[i]==0) return -1;
        }
        return c;
    }
}