// Last updated: 7/31/2025, 12:17:52 PM
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0) return n;
        return n*=2;
    }
}