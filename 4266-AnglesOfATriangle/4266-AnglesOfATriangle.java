// Last updated: 5/9/2026, 11:22:13 AM
class Solution {
    public double[] internalAngles(int[] sides) {
        Arrays.sort(sides);
        int a = sides[0], b = sides[1], c = sides[2];
        if (a + b <= c)
            return new double[0];
        double A = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2.0 * b * c)));
        double B = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2.0 * a * c)));
        double C=180-A-B;
        double[]ans={A,B,C};
        Arrays.sort(ans);
        return ans;

    }
}