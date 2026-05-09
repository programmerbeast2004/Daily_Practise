// Last updated: 5/9/2026, 11:27:09 AM
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum=0;
        int i=0, j=nums.length-1;
        while(i<j){
            int pairSum=nums[i]+nums[j];
            maxSum=Math.max(pairSum,maxSum);
            i++;
            j--;
        }
        return maxSum;
    }
}