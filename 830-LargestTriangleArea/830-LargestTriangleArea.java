// Last updated: 7/31/2025, 12:19:36 PM
import java.util.*;

public class Solution {
    public static double largestTriangleArea(int[][] points) {
        double maxArea = 0.0;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    double area = triangleArea(points[i], points[j], points[k]);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    private static double triangleArea(int[] p1, int[] p2, int[] p3) {
        return 0.5 * Math.abs(
            p1[0] * (p2[1] - p3[1]) +
            p2[0] * (p3[1] - p1[1]) +
            p3[0] * (p1[1] - p2[1])
        );
    }
}