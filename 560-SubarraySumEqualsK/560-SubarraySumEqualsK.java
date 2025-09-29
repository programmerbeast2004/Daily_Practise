// Last updated: 9/29/2025, 2:33:13 PM
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;
        // Map to store frequency of prefix sums: <sum, frequency>
        Map<Integer, Integer> prefixSumFreq = new HashMap<>();
        // Base case: a prefix sum of 0 exists once (before any elements are added)
        prefixSumFreq.put(0, 1);

        for (int num : nums) {
            currentSum += num; // Calculate the current prefix sum

            // If (currentSum - k) exists in the map, it means there's a subarray
            // ending at the current position whose sum is k.
            // The number of times it exists tells us how many such subarrays there are.
            if (prefixSumFreq.containsKey(currentSum - k)) {
                count += prefixSumFreq.get(currentSum - k);
            }

            // Add the current prefix sum to the map or increment its frequency
            prefixSumFreq.put(currentSum, prefixSumFreq.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}