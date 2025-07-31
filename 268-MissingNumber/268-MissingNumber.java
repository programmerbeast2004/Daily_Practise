// Last updated: 7/31/2025, 12:20:35 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        long SN=(n*(n+1))/2;
        long sum=0;
        for(int elements:nums){
            sum=sum+elements;
        }
        return (int)(SN-sum);
    }
}