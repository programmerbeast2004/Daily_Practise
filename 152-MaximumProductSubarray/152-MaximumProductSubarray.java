// Last updated: 10/13/2025, 7:17:24 PM
class Solution {
    public int maxProduct(int[] nums) {
        int pre=1; int suf=1;
        int res=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            pre*=nums[i];
            res=Math.max(pre,res);
            if(pre==0) pre=1;

            suf*=nums[n-i-1];
            res=Math.max(suf,res);
            if(suf==0) suf=1;
        }
        return res;
    }
}