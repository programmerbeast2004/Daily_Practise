// Last updated: 7/31/2025, 12:20:38 PM
class Solution {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        
        int sum = 0;
        for (int i = num; i > 0; i /= 10) {
            sum += i % 10;
        }
        
        return addDigits(sum);
    }
}