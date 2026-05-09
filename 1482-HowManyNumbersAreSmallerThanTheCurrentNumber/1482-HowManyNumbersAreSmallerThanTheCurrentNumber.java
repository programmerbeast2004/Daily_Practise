// Last updated: 5/9/2026, 11:28:22 AM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[]count=new int[101];
        for(int i:nums){
            count[i]++;
        }
        for(int i=1;i<=100;i++){
            count[i]+=count[i-1];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]==0?0:count[nums[i]-1];
        }
        return nums;
    }
}