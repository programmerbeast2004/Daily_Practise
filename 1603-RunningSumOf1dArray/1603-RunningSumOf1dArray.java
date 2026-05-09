// Last updated: 5/9/2026, 11:28:09 AM
class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] pre=new int[n];
        pre[0]=nums[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        return pre;
    }
}