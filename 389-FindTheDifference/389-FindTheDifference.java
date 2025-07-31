// Last updated: 7/31/2025, 12:20:19 PM
class Solution {
    public char findTheDifference(String s, String t) {
        int result = 0;
        for (char c : t.toCharArray()) {
            result += c;
        }
        for (char c : s.toCharArray()) {
            result -= c;
        }
        return (char) result;
    }
}