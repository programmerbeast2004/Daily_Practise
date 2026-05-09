// Last updated: 5/9/2026, 11:24:54 AM
class Solution {
    public int furthestDistanceFromOrigin(String m) {
        int l=0,r=0,b=0;
        for(char c:m.toCharArray()){
            if(c=='L')l++;
            else if(c=='R')r++;
            else b++;
        }
        return (Math.abs(r-l)+b);
    }
}