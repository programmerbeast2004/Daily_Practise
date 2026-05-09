// Last updated: 5/9/2026, 11:22:01 AM
class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c=0;
        for(int num:nums){
            // if(num==0 && digit==0){
            //     c++;
            //     continue;
            // }
            while(num>0){
                if(num % 10 == digit){
                    c++;
                }
                num/=10;
            }
        }
        return c;
    }
}