// Last updated: 11/22/2025, 6:44:35 PM
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