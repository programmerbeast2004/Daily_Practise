// Last updated: 5/9/2026, 11:23:20 AM
class Solution {
    public int longestBalanced(String s) {
        int n=s.length();
        int len=0;
        for(int i=0;i<n;i++){
            int[] freq=new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                if(isBalance(freq)){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
    public boolean isBalance(int[] freq){
        int ct=0;
        for(int f:freq){
            if(f>0){
                if(ct==0){
                    ct=f;
                }
                else if(ct!=f){
                    return false;
                }
            }
        }
        return true;
    }
}