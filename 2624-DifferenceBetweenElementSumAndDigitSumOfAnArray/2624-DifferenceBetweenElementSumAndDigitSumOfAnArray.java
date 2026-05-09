// Last updated: 5/9/2026, 11:25:37 AM
class Solution {
    public int differenceOfSum(int[] nums) {
        int es=0, ds=0;
        for(int num:nums){
            es+=num;
            int temp=num;
            while(temp>0){
                ds+=temp%10;
                temp/=10;
            }
        }
        return Math.abs(ds-es);
    }
}