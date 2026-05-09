// Last updated: 5/9/2026, 11:28:18 AM
class Solution {
    public int minStartValue(int[] nums) {
        int min=0;
        int s=0;
        for(int num:nums){
            s+=num;
        if(s<min){
            min=s;
        }
        }
        return 1-min;
    }
}