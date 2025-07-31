// Last updated: 7/31/2025, 12:18:47 PM
class Solution {
    public double angleClock(int hour, int minutes) {
        double res=Math.abs(30*hour-(5.5*minutes));
        return Math.min(res,360-res);
    }
}