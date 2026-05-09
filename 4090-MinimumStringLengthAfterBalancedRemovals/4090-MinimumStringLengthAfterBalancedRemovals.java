// Last updated: 5/9/2026, 11:23:11 AM
class Solution {
    public int minLengthAfterRemovals(String s) {
        int c1=0,c2=0;
        for(char c:s.toCharArray()){
            if(c=='a') c1++;
            else c2++;
        }
        return Math.abs(c1-c2);
    }
}