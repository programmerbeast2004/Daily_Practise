// Last updated: 5/9/2026, 11:27:33 AM
class Solution {
    public int maximumScore(int a, int b, int c) {
        int s=a+b+c;
        int m=Math.max(a,Math.max(b,c));
        return Math.min(s/2,s-m);
    }
}