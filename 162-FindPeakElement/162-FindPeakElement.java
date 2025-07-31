// Last updated: 7/31/2025, 12:21:07 PM
class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1)
            return 0;

        for (int i = 1; i < nums.length - 1; i++)
            if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i])
                return i;

        if (nums[0] > nums[1])
            return 0;

        return nums.length - 1;
    }
}