// Last updated: 5/26/2026, 11:31:04 PM
1class Solution {
2    public boolean detectCapitalUse(String word) {
3        if(word.equals(word.toUpperCase())){
4            return true;
5        }
6        if(word.equals(word.toLowerCase())){
7            return true;
8        }
9        String f=word.substring(0,1).toUpperCase();
10        String r=word.substring(1).toLowerCase();
11        return word.equals(f+r);
12    }
13}