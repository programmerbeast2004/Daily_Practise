// Last updated: 9/27/2025, 9:43:09 PM
class Solution {
    public int maxNumberOfBalloons(String text) {
       int[] freq=new int[26];
       for(char c:text.toCharArray()){
        freq[c-'a']++;
       }
        int b=freq['b'-'a']/1;
        int a=freq['a'-'a']/1;
        int l=freq['l'-'a']/2;
        int o=freq['o'-'a']/2;
        int n=freq['n'-'a']/1;
        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }
}