// Last updated: 7/31/2025, 12:18:18 PM
class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long totalSum = 0; // Total absolute sum
        int numNegatives = 0; // Count of negative numbers
        int smallestAbsValue = Integer.MAX_VALUE; // Smallest absolute value
        
        // Traverse the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int value = matrix[i][j];
                totalSum += Math.abs(value); // Add absolute value to total sum
                
                if (value < 0) {
                    numNegatives++; // Count negatives
                }
                
                // Track smallest absolute value
                smallestAbsValue = Math.min(smallestAbsValue, Math.abs(value));
            }
        }
        
        // If the number of negatives is odd, adjust the sum
        if (numNegatives % 2 == 1) {
            totalSum -= 2L * smallestAbsValue; // Subtract twice the smallest absolute value
        }
        
        return totalSum;
    }
}