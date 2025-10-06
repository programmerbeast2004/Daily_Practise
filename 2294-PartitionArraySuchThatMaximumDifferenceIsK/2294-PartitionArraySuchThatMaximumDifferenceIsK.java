// Last updated: 10/6/2025, 10:01:10 PM
class Solution {
    public int partitionArray(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int ct=1;
        int start=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]-start>k){
                ct++;
                start=nums[i];
            }
        }
        return ct;
    }
}