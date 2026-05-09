// Last updated: 5/9/2026, 11:25:16 AM
class Solution {
    public long maxStrength(int[] nums) {

        long product = 1;
        int negCount = 0;
        int nonZeroCount = 0;
        int maxNeg = Integer.MIN_VALUE;
        boolean hasZero = false;

        for (int x : nums) {
            if (x == 0) {
                hasZero = true;
                continue;
            }

            nonZeroCount++;
            product *= x;

            if (x < 0) {
                negCount++;
                maxNeg = Math.max(maxNeg, x);
            }
        }

        if (nonZeroCount == 0) return 0;

        if (nonZeroCount == 1 && product < 0) {
            return hasZero ? 0 : product;
        }

        if (negCount % 2 == 1) {
            product /= maxNeg;
        }

        return product;
    }
}
