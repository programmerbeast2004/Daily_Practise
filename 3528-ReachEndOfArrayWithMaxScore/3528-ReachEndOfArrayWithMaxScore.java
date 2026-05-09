// Last updated: 5/9/2026, 11:24:09 AM
class Solution {
    public long findMaximumScore(List<Integer> nums) {
        long res=0, m=0;
        for(int n:nums){
            res+=m;
            m=Math.max(m,n);
        }
        return res;

    }
}