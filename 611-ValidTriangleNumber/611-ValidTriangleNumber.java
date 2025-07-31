// Last updated: 7/31/2025, 12:19:53 PM
class Solution {
    public int triangleNumber(int[] nums) {
        int n = nums.length;
        int count = 0;

        // Sort the array so we can safely apply triangle condition
        Arrays.sort(nums);

        // Try every triplet combination
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] == 0) continue; // A side with length 0 can't form a triangle
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Triangle condition: a + b > c
                    if (nums[i] + nums[j] > nums[k]) {
                        count++;
                    } else {
                        break; // Because array is sorted, no later k will work
                    }
                }
            }
        }

        return count;
    }
}
