// Last updated: 5/25/2026, 2:55:15 PM
1class Solution {
2    public String reverseWords(String s) {
3        String[] words=s.split("\\s+");
4        StringBuilder sb=new StringBuilder();
5        for(String word:words){
6            StringBuilder rev=new StringBuilder(word);
7            rev.reverse();
8            sb.append(rev).append(" ");
9        }
10        return sb.toString().trim();
11    }
12}