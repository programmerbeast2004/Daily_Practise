// Last updated: 5/9/2026, 11:28:57 AM
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
    String[] words=text.split(" ");
    int count=0;
    for(String word:words){
        boolean canType=true;
        for(char c:brokenLetters.toCharArray()){
            if(word.indexOf(c)!=-1){
                canType=false;
                break;
            }
        }
        if(canType) count++;
    }
    return count++;
    }
}