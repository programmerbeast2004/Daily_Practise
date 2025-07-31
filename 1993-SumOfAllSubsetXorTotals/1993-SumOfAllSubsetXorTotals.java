// Last updated: 7/31/2025, 12:18:24 PM
class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    private int dfs(int[] nums, int index, int currXor) {
        if (index == nums.length) {
            return currXor;
        }
        
        // Include nums[index]
        int include = dfs(nums, index + 1, currXor ^ nums[index]);

        // Exclude nums[index]
        int exclude = dfs(nums, index + 1, currXor);

        return include + exclude;
    }
}
