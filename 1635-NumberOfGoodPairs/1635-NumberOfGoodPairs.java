// Last updated: 5/9/2026, 11:28:02 AM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] f=new int[101];
        int c=0;
        for(int num:nums){
            c+=f[num];
            f[num]++;
        }
        return c;
    }
}