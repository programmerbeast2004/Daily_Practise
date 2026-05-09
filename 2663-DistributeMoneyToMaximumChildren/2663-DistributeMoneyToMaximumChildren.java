// Last updated: 5/9/2026, 11:25:32 AM
class Solution {
    public int distMoney(int m, int c) {
        if(m<c) return -1;
        m-=c;
        int e=Math.min(m/7,c);
        m-=e*7;
        c-=e;
        if(c==0 && m>0) e--;
        if(c==1 && m==3)e--;
        return e;
    }
}