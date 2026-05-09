// Last updated: 5/9/2026, 11:31:23 AM
class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;

        Arrays.sort(nums);

        int i = 0, j = 1;
        int c = 0;

        while (j < nums.length) {

            if (i == j) {
                j++;
            }
            else if (nums[j] - nums[i] < k) {
                j++;
            }
            else if (nums[j] - nums[i] > k) {
                i++;
            }
            else {
                c++;
                i++;
                j++;

                // skip duplicates
                while (j < nums.length && nums[j] == nums[j - 1]) {
                    j++;
                }
            }
        }

        return c;
    }
}