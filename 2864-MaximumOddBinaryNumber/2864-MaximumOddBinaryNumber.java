// Last updated: 4/2/2026, 1:48:36 PM
1class Solution {
2    public String maximumOddBinaryNumber(String s) {
3        int cnt=s.length()-s.replace("1","").length();
4        return "1".repeat(cnt-1)+"0".repeat(s.length()-cnt)+"1";
5    }
6}