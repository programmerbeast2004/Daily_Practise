// Last updated: 1/18/2026, 8:33:11 AM
1class Solution {
2    public int vowelConsonantScore(String s) {
3        int v=0, c=0;
4        for(char ch:s.toCharArray()){
5            if(ch>='a' && ch<='z'){
6                if("aeiou".indexOf(ch)!=-1){
7                    v++;
8                }
9                else{
10                    c++;
11                }
12            }
13        }
14       return c==0? 0: v/c;
15    }
16}