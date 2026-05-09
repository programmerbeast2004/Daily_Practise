// Last updated: 5/9/2026, 11:26:59 AM
class Solution {
    public int minimumDifference(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<=n-k;i++){
            int dif=nums[i+k-1]-nums[i];
            min=Math.min(min,dif);
        }
        return min;
    }
}