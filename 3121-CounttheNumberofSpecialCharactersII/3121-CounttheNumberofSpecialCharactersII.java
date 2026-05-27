// Last updated: 5/27/2026, 11:28:46 PM
1class Solution {
2    public int numberOfSpecialChars(String word) {
3        int c=0;
4        for(char ch='a';ch<='z';ch++){
5            int l=word.lastIndexOf(ch);
6            int u=word.indexOf(Character.toUpperCase(ch));
7            if(l!=-1 && u!=-1 && l<u){
8                c++;
9            }
10        }
11        return c;
12    }
13}