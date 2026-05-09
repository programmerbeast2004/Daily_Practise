// Last updated: 5/9/2026, 11:24:04 AM
class Solution {
    public char kthCharacter(int k) {
        return (char)('a'+Integer.bitCount(k-1));
    }
}