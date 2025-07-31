// Last updated: 7/31/2025, 12:17:26 PM
class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0, right = nums[n-1] - nums[0];
        while (left < right) {
            int mid = (right + left) / 2;
            int countPairs = 0;
            for (int i = 1; i < n && countPairs < p; i++) {
                if (nums[i] - nums[i-1] <= mid) {
                    i++;
                    countPairs++;
                }
            }
            if (countPairs >= p) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}