// Last updated: 5/9/2026, 11:31:44 AM
class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        int c=0;
        for(int x:nums) 
            if(x<min)
                min=x;
        for(int x:nums) 
            c+=x-min;
        return c;
    }
}