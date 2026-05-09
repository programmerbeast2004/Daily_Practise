// Last updated: 5/9/2026, 11:23:21 AM
class Solution {
    public boolean scoreBalance(String s) {
        int n=s.length();
        int total=0;
        for(char c:s.toCharArray()){
            total+=(c-'a'+1);
        }
        int l=0;
        for(int i=0;i<n-1;i++){
            l+=(s.charAt(i)-'a'+1);
            int r=total-l;
            if(l==r) return true;
        }
        return false;
    }
}