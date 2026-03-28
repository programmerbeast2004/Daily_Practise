// Last updated: 3/28/2026, 11:31:21 PM
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        for(char ch:letters){
4            if(ch>target){
5                return ch;
6            }
7        }
8        return letters[0];
9    }
10}