// Last updated: 5/9/2026, 11:27:44 AM
class Solution {
    public boolean closeStrings(String w1, String w2) {
        if(w1.length() !=w2.length()) return false;
        int[] f1=new int[26];
        int[] f2=new int[26];
        for(char c1:w1.toCharArray()) f1[c1-'a']++;
        for(char c2:w2.toCharArray()) f2[c2-'a']++;
        for(int i=0;i<26;i++){
            if(f1[i]==0 && f2[i]!=0 || f1[i]!=0 &&f2[i]==0){
                return false;
            }
        }
        Arrays.sort(f1);
        Arrays.sort(f2);
        return Arrays.equals(f1,f2);
    }
}