// Last updated: 10/15/2026, 11:49:14 AM
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int length = nums.length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < length; ++i) {
            int value = nums[i];
            if (value < 0) nums[i] = value = -value;
            if (value < min) min = value;
            if (value > max) max = value;
        }
        int[] counts = new int[max + 1];
        for (int i = 0; i < length; ++i) {
            ++counts[nums[i]];
        }
        int negatives = length >> 1;
        long result = 0;
        for (int num = min; num <= max; ++num) {
            int count = counts[num];
            if (count == 0) continue;
            long sq = num * num;
            if (count <= negatives && negatives != 0) {
                result -= sq * count;
                negatives -= count;
            } else if (negatives == 0) {
                result += sq * count;
            } else {
                result -= sq * negatives;
                result += sq * (count - negatives);
                negatives = 0;
            }
        }
        return result;
    }
}