// Last updated: 5/9/2026, 11:30:42 AM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char ch:letters){
            if(ch>target){
                return ch;
            }
        }
        return letters[0];
    }
}