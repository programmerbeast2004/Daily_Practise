// Last updated: 7/31/2025, 12:19:23 PM
class Solution {
    public static int subarraysDivByK(int[] arr, int k) {
        int n = arr.length;
        int[] freq = new int[k];
        freq[0] = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            int rem = sum % k;
            if (rem < 0) {
                rem += k;
            }
            freq[rem]++;
        }

        int ans = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] >= 2) {
                int x = freq[i];
                ans += ((x - 1) * x) / 2;
            }
        }
        return ans;
    }
}
