// Last updated: 7/31/2025, 12:17:53 PM
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {    
            sum += num % 10;    
            num /= 10;  
        }
        return sum;  
    }

    public int maximumSum(int[] nums) {
        Map<Integer, int[]> digitSumMap = new HashMap<>();
        int maxSum = -1;

        for (int num : nums) {
            int digitSum = sumOfDigits(num);
            if (!digitSumMap.containsKey(digitSum)) {
                digitSumMap.put(digitSum, new int[]{num, -1}); 
            } else {
                int[] maxNums = digitSumMap.get(digitSum);
                if (num > maxNums[0]) {
                    maxNums[1] = maxNums[0];
                    maxNums[0] = num;
                } else if (num > maxNums[1]) {
                    maxNums[1] = num;
                }
            }
        }

        for (int[] values : digitSumMap.values()) {
            if (values[1] != -1) {
                maxSum = Math.max(maxSum, values[0] + values[1]);
            }
        }

        return maxSum;
    }
}
