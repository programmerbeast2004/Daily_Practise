// Last updated: 5/9/2026, 11:27:39 AM
class Solution {
    public int largestAltitude(int[] gain) {
        int s=0;
        int max=0;
        for(int i:gain){
            s+=i;
            max=Math.max(s,max);
        }
        return max;
    }
}