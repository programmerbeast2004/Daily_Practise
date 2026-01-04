// Last updated: 1/4/2026, 11:25:09 AM
1class Solution {
2    public int maxRepeating(String seq, String word) {
3        StringBuilder sb=new StringBuilder(word);
4        int c=0;
5        while(seq.contains(sb.toString())){
6            c++;
7            sb.append(word);
8        }
9        return c;
10    }
11}