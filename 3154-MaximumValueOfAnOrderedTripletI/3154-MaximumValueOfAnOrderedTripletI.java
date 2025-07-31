// Last updated: 7/31/2025, 12:17:10 PM
class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long maxVal = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    long value = (long)(nums[i] - nums[j]) * nums[k];
                    maxVal = Math.max(maxVal, value);
                }
            }
        }
        return maxVal;
    }
}
