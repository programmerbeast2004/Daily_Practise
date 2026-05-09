// Last updated: 5/9/2026, 11:23:54 AM
class Solution {
    public int countPartitions(int[] nums) {
        int ts=0;
        for(int i=0;i<nums.length;i++){
            ts+=nums[i];
        }
        int l=0;
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            l+=nums[i];
            int r=ts-l;
            if((l%2)==(r%2)){
                c++;
            }
        }
        return c;
    }
}