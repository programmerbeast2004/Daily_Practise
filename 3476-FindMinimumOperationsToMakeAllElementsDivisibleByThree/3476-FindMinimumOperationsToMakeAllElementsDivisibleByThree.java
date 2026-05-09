// Last updated: 5/9/2026, 11:24:16 AM
class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int num:nums){
            if(num%3!=0){
                c++;
            }
        }
        return c;
    }
}