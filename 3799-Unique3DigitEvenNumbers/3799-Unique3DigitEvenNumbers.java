// Last updated: 5/9/2026, 11:23:46 AM
class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        int n = digits.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i != j && j != k && i != k) {
                        int a = digits[i];
                        int b = digits[j];
                        int c = digits[k];

                        // a != 0 ensures 3-digit number
                        // c % 2 == 0 ensures even number
                        if (a != 0 && c % 2 == 0) {
                            int res = a * 100 + b * 10 + c;
                            set.add(res);
                        }
                    }
                }
            }
        }

       return set.size();
    }
}