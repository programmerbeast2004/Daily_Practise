// Last updated: 9/28/2025, 6:25:00 AM
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charfreq=new int[26];
        for(char c:chars.toCharArray()){
            charfreq[c-'a']++;
        }
        int total=0;
        for(String word:words){
            if (canForm(word, charfreq)) {
                total += word.length();
            }
        }
        return total;
    }
   private boolean canForm(String word, int[] charFreq) {
        int[] wordFreq = new int[26];
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            wordFreq[idx]++;
            if (wordFreq[idx] > charFreq[idx]) {
                return false;
            }
        }
        return true;
    }
}