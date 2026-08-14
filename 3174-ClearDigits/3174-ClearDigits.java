// Last updated: 8/14/2026, 8:00:48 PM
1class Solution {
2    public String clearDigits(String s) {
3        StringBuilder st=new StringBuilder();
4
5        for(char c:s.toCharArray()){
6            if(Character.isDigit(c)){
7                st.deleteCharAt(st.length()-1);
8            }
9            else{
10                st.append(c);
11            }
12        }
13        return st.toString();
14    }
15}