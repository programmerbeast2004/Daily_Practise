// Last updated: 5/9/2026, 11:27:28 AM
class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum=0;
        for(int x:nums){
            sum+=x;
        }
        long diff=Math.abs(goal-sum);
        long res=(diff+limit-1)/limit;
        return (int)res;
    }
}