// Last updated: 5/9/2026, 11:28:46 AM
class Solution {
    public int balancedStringSplit(String s) {
        int c=0;
        int b=0;
        for(char ch:s.toCharArray()){
            if(ch=='L')b++;
            else b--;
            if(b==0)c++;
        }
        return c;
    }
}