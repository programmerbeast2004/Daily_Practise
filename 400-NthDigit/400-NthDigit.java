// Last updated: 7/31/2025, 12:20:16 PM
class Solution {
    public int findNthDigit(int n) {
        int digitLength = 1;
    long count = 9;
    int start = 1;

    // Step 1: Find the range where the nth digit falls
    while (n > digitLength * count) {
        n -= digitLength * count;
        digitLength++;
        count *= 10;
        start *= 10;
    }

    // Step 2: Find the exact number containing the nth digit
    int number = start + (n - 1) / digitLength;

    // Step 3: Find the digit in that number
    String numberStr = Integer.toString(number);
    return numberStr.charAt((n - 1) % digitLength) - '0';
    }
}