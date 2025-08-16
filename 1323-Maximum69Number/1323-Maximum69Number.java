// Last updated: 8/16/2025, 2:58:13 PM
class Solution {
    public int maximum69Number (int num) {
        String s=Integer.toString(num);
        s=s.replaceFirst("6","9");
        return Integer.parseInt(s);
    }
}