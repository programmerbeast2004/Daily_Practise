// Last updated: 7/31/2025, 12:20:22 PM
class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int tmp=(a&b)<<1;
            a=a^b;
            b=tmp;
        }
        return a;
    }
}