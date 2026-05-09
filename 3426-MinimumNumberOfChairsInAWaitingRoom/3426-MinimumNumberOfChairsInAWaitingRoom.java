// Last updated: 5/9/2026, 11:24:23 AM
class Solution {
    public int minimumChairs(String s) {
        int c=0;
        int min=0;
        for(char ch:s.toCharArray()){
            if(ch=='E'){
                c++;
                min=Math.max(min,c);
            }
            else{
                c--;
            }
        }
        return min;
    }
}