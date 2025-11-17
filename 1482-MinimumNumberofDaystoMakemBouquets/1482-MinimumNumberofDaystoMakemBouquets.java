// Last updated: 11/18/2025, 4:19:30 AM
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long total = (long) m * k;
        if (total > bloomDay.length) return -1; 
        int left = 1;
        int right = 0;
        for (int day : bloomDay) {
            right = Math.max(right, day);
        }
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canMake(bloomDay, m, k, mid)) {
                ans = mid;       
                right = mid - 1; 
            } else {
                left = mid + 1;  
            }
        }
        return ans;
    }
    private boolean canMake(int[] bloomDay, int m, int k, int dayLimit) {
        int bouquets = 0;
        int flowers = 0;

        for (int day : bloomDay) {
            if (day <= dayLimit) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        return bouquets >= m;
    }
}
