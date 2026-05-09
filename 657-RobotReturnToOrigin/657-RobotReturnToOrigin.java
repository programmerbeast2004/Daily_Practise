// Last updated: 5/9/2026, 11:31:02 AM
class Solution {
    public boolean judgeCircle(String m) {
        int x=0; int y=0;
        for(char c:m.toCharArray()){
            if(c=='U') y++;
            else if(c=='D')y--;
            else if(c=='R')x++;
            else{
                x--;
            }
        }
        return x==0 && y==0;
    }
}