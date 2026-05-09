// Last updated: 5/9/2026, 11:23:58 AM
class Solution {
    public int smallestNumber(int n) {
        int x=n;
        while((x&(x+1))!=0){
            x++;
        }
        return x;
    }
}