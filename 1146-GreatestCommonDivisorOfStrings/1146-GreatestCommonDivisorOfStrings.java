// Last updated: 7/31/2025, 12:19:11 PM
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int minLength = Math.min(str1.length(), str2.length());

        // Step 3: Try all possible prefix lengths from minLength to 1
        for (int i = minLength; i >= 1; i--) {
            String candidate = str1.substring(0, i);

            // Check if candidate can build both strings
            if (isDivisible(str1, candidate) && isDivisible(str2, candidate)) {
                return candidate;
            }
        }

        return ""; // No common divisor found
    }

    // Helper method to check if str is made by repeating pattern
    private boolean isDivisible(String str, String pattern) {
        int len = pattern.length();
        if (str.length() % len != 0) return false;

        StringBuilder sb = new StringBuilder();
        int repeatCount = str.length() / len;
        for (int i = 0; i < repeatCount; i++) {
            sb.append(pattern);
        }

        return sb.toString().equals(str);
    }
}
