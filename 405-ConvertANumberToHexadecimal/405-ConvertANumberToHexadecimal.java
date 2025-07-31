// Last updated: 7/31/2025, 12:20:13 PM
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0"; // Handle the case where num is 0
        
        int d = num; // Keep num as it is
        String digits = "0123456789abcdef";
        int base = 16;  
        String hex = "";
        
        for (int i = 0; i < 8 && d != 0; i++) { // Process up to 8 hex digits
            int digit = d & 15;  // Extract last 4 bits (hex digit)
            hex = digits.charAt(digit) + hex;  
            d >>>= 4; // Unsigned right shift to handle negatives properly
        }
        
        return hex;
    }
}
