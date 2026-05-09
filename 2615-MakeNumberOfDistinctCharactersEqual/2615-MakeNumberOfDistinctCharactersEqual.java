// Last updated: 5/9/2026, 11:25:39 AM
class Solution {
    public boolean isItPossible(String word1, String word2) {
        int[] f1=new int[26];
        int[] f2=new int[26];

        for(char c:word1.toCharArray()) f1[c-'a']++;
        for(char c:word2.toCharArray()) f2[c-'a']++;

        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                if(f1[i]==0 || f2[j]==0) continue;
                f1[i]--;
                f2[j]--;
                f1[j]++;
                f2[i]++;
                if(dist(f1)==dist(f2)) return true;
                f1[j]--;
                f2[i]--;
                f1[i]++;
                f2[j]++;
            }
        }
        return false;
    }
    private int dist(int[] freq){
        int c=0;
        for(int f:freq){
            if(f>0) c++;
        }
        return c;
    }
}