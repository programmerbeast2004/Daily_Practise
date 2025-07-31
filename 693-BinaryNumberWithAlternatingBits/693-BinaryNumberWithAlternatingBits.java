// Last updated: 7/31/2025, 12:19:46 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n!=0){
            int a=(n&1);
            n>>=1;
            int b=(n&1);
            if(a==b)
                return false;
        }
        return true;
    }
}