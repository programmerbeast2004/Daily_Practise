// Last updated: 11/23/2025, 12:18:36 AM
class Solution {
    public int longestPalindrome(String s) {
        int[] freq=new int[128];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        int len=0;
        boolean odd=false;
        for(int c: freq){
            len+=(c/2)*2;
            if(c%2==1) odd=true;
        }
        return odd ? len+1:len;
    }
}