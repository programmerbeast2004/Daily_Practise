// Last updated: 7/31/2025, 12:19:40 PM
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            String binary = toBinary(i);
            int setBits = countSetBits(binary);
            if (isPrime(setBits)) {
                result++;
            }
        }
        return result;
    }
    public static String toBinary(int num) {
        return Integer.toBinaryString(num);
    }
    public static int countSetBits(String binary) {
        int count = 0;
        for (char c : binary.toCharArray()) {
            if (c == '1') count++;
        }
        return count;
    }
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}