// Last updated: 5/9/2026, 11:26:27 AM
class Solution {
    public int minBitFlips(int x, int y) {
        int c=0;
        int xor=x^y;
        while(xor!=0){
            xor=xor&(xor-1);
            c++;
        }
        return c;
    }
}