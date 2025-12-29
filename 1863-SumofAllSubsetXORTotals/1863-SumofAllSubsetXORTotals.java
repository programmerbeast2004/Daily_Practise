// Last updated: 12/29/2025, 2:21:04 PM
1class Solution {
2    public int subsetXORSum(int[] nums) {
3        return dfs(nums, 0, 0);
4    }
5
6    private int dfs(int[] nums, int index, int currXor) {
7        if (index == nums.length) {
8            return currXor;
9        }
10        
11        // Include nums[index]
12        int include = dfs(nums, index + 1, currXor ^ nums[index]);
13
14        // Exclude nums[index]
15        int exclude = dfs(nums, index + 1, currXor);
16
17        return include + exclude;
18    }
19}