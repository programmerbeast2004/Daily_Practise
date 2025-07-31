// Last updated: 7/31/2025, 12:20:46 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true ;
        while(n>3){
            if(n%2!=0)
            return false;
            n/=2;
        }
        return n==2;
        
    }
}