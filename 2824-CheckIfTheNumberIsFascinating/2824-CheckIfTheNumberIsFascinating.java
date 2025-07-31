// Last updated: 7/31/2025, 12:17:13 PM
class Solution {
    public boolean isFascinating(int n) {
        String str = Integer.toString(n);
        String str1 = Integer.toString(2 * n);
        String str2 = Integer.toString(3 * n);
        String ftr = str + str1 + str2;
        if (ftr.length() != 9) return false;
        int[] count = new int[10];
        for (int i = 0; i < ftr.length(); i++) {
            int digit = ftr.charAt(i) - '0';
            if (digit == 0) return false;
            count[digit]++;
        }
        for (int i = 1; i <= 9; i++) {
            if (count[i] != 1) return false;
        }
        return true;
    }
}
