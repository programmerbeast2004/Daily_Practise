// Last updated: 7/31/2025, 12:18:11 PM
class Solution {
    public int longestPalindrome(String[] words) {
        int[][] count = new int[26][26];  // Since words are two lowercase letters only
        int length = 0;

        for (String word : words) {
            int a = word.charAt(0) - 'a';
            int b = word.charAt(1) - 'a';

            if (count[b][a] > 0) {
                length += 4;  // Pair found, contributes 4 to the length
                count[b][a]--; // Use up the reverse pair
            } else {
                count[a][b]++;
            }
        }

        // Check for any center palindrome like "cc", "gg" etc.
        for (int i = 0; i < 26; i++) {
            if (count[i][i] > 0) {
                length += 2;  // One such word can be in the center
                break;
            }
        }

        return length;
    }
}
