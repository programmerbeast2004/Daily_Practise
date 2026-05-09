// Last updated: 5/9/2026, 11:23:03 AM
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int n:nums){
            if(n>max1){
                max2=max1;
                max1=n;
            }
            else if(n>max2){
                max2=n;
            }

            if(n<min){
                min=n;
            }
        }
        return max1+max2-min;
    }
}