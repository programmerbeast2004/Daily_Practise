// Last updated: 7/31/2025, 12:18:28 PM
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0, n = s1.length(), idx1 = 0, idx2 = 0;
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count > 2) return false;
                
                if (count == 1) idx1 = i;
                else idx2 = i;
            }
        }
        return (s1.charAt(idx2) == s2.charAt(idx1))&&(s1.charAt(idx1) == s2.charAt(idx2));
    }
}