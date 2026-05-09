// Last updated: 5/9/2026, 11:26:16 AM
class Solution {
    public int rearrangeCharacters(String text, String target) {
        int[] freqTarget=new int[26];
        int[] freqText=new int[26];

        for(char c:target.toCharArray()){
            freqTarget[c-'a']++;
        }
        for(char c:text.toCharArray()){
            freqText[c-'a']++;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(freqTarget[i]>0){
                ans = Math.min(ans, freqText[i] / freqTarget[i]);
            }

        }
        return ans;
    }
}