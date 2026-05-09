// Last updated: 5/9/2026, 11:23:49 AM
class Solution {
    public int maxFrequency(int[] nums, int k) {
        int count[]=new int[51];
        int res=0;
        for(int a:nums){
            count[a]=Math.max(count[a],count[k])+1;
            res=Math.max(res,count[a]-count[k]);
        }
        return count[k]+res;
    }
}