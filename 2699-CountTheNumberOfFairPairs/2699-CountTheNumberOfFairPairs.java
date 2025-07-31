// Last updated: 7/31/2025, 12:17:31 PM
import java.util.Arrays;

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int left = lowerBound(nums, i + 1, n - 1, lower - nums[i]);
            int right = upperBound(nums, i + 1, n - 1, upper - nums[i]);
            count += right - left + 1;
        }

        return count;
    }

    // First index where nums[index] >= target
    private int lowerBound(int[] nums, int start, int end, int target) {
        int low = start, high = end, res = end + 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    // Last index where nums[index] <= target
    private int upperBound(int[] nums, int start, int end, int target) {
        int low = start, high = end, res = start - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) {
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
}
