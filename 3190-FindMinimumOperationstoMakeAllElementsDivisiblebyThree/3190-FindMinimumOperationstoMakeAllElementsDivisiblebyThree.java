// Last updated: 11/22/2025, 6:05:31 PM
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