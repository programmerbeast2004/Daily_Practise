// Last updated: 5/9/2026, 11:26:29 AM
class Solution {
    public int countCollisions(String d) {
        int n=d.length();
        int l=0,r=n-1;
        while(l<n &&d.charAt(l)=='L') l++;
        while(r>=0 &&d.charAt(r)=='R') r--;
        int c=0;
        for(int i=l;i<=r;i++){
            if(d.charAt(i)!='S'){
                c++;
            }
        }
        return c;
    }
}