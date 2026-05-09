// Last updated: 5/9/2026, 11:21:54 AM
class Solution {
    public boolean validDigit(int n, int x) {
        String num=String.valueOf(n);
        char dt=(char)(x+'0');
        boolean nb=num.charAt(0)!=dt;
        boolean ct=num.indexOf(dt)!=-1;
        return nb &&ct;
    }
}