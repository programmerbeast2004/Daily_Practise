// Last updated: 7/31/2025, 12:18:09 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0) return true;
        return num%10!=0;
    }
}