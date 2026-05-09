// Last updated: 5/9/2026, 11:23:32 AM
class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int or=0;
        for(int num:nums){
            if(num%2==0){
                or=or | num;
            }

        }
        return or;
    }
}