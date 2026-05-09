// Last updated: 5/9/2026, 11:22:24 AM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res=new StringBuilder();
        for(String w:words){
            int s=0;
            for(char ch: w.toCharArray()){
                s+=weights[ch-'a'];
            }
            int mod=s%26;
            char mp=(char)('z'-mod);
            res.append(mp);
        }
        return res.toString();
    }
}