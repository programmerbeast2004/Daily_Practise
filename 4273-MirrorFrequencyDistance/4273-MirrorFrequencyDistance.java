// Last updated: 5/9/2026, 11:22:07 AM
class Solution {
    public int mirrorFrequency(String s) {
        int res=0;
        int[]freq=new int[128];
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        for(char c='a';c<='z';c++){
            char m=(char)('a'+('z'-c));
            if(c<=m){
                res+=Math.abs(freq[c]-freq[m]);
            }
        }
        for(char c='0';c<='9';c++){
            char m=(char)('0'+('9'-c));
            if(c<=m){
                res+=Math.abs(freq[c]-freq[m]);
            }
        }
        return res;
    }
}