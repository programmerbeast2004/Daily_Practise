// Last updated: 5/9/2026, 11:24:56 AM
class Solution {
    public String maximumOddBinaryNumber(String s) {
        int cnt=s.length()-s.replace("1","").length();
        return "1".repeat(cnt-1)+"0".repeat(s.length()-cnt)+"1";
    }
}