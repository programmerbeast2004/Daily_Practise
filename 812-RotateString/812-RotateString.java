// Last updated: 5/9/2026, 11:30:23 AM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        return (s+s).contains(goal);
    }
}