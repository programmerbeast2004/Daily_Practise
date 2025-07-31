// Last updated: 7/31/2025, 12:18:50 PM
class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int sum = 0;

        for (int i = 0; i < n-1; i++) {
            result[i] = i+1;
            sum += result[i];
        }
        result[n - 1] = -1 * sum;
        return result;
    }

}