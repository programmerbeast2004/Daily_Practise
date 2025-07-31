// Last updated: 7/31/2025, 12:20:00 PM
class Solution {
    public String convertToBase7(int num) {
        return num < 0 ? "-" + convertToBase7(-num) : (num < 7 ? String.valueOf(num) : convertToBase7(num / 7) + (num % 7));
    }
}