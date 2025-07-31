// Last updated: 7/31/2025, 12:18:46 PM
class Solution {
    public int maximum69Number (int num) {
        String s=Integer.toString(num);
        s=s.replaceFirst("6","9");
        return Integer.parseInt(s);
    }
}