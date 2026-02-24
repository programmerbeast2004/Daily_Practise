// Last updated: 2/24/2026, 4:45:41 PM
1class Solution {
2    public char kthCharacter(int k) {
3        return (char)('a'+Integer.bitCount(k-1));
4    }
5}