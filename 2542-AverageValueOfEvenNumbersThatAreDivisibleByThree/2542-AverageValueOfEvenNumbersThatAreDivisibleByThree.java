// Last updated: 7/31/2025, 12:17:46 PM
class Solution {
    public int averageValue(int[] nums) {
        int s=0,c=0;
        for(int num: nums){
            if(num%6==0){
                s+=num;
                c++;
            }
        }
        return c==0?0:s/c;
    }
}