// Last updated: 10/3/2025, 6:11:31 AM
class Solution {
    public int jump(int[] nums) {
        int m=0, jumps=0, curr=0;
        for(int i=0;i<nums.length-1;i++){
            m=Math.max(m,i+nums[i]);
            if(i==curr){
                jumps++;
                curr=m;
            }
        }
        return jumps;
    }
}