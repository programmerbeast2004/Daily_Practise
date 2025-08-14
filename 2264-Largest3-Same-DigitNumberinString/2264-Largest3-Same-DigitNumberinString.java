// Last updated: 8/14/2025, 10:48:07 AM
class Solution {
    public String largestGoodInteger(String num) {
        String largest = "";
        char[] cha = num.toCharArray();
        
        for (int i = 0; i <= cha.length - 3; i++) {
            if (cha[i] == cha[i+1] && cha[i] == cha[i+2]) {
                String triple = "" + cha[i] + cha[i] + cha[i];
                if (largest.isEmpty() || triple.compareTo(largest) > 0) {
                    largest = triple;
                }
            }
        }
        
        return largest;
    }
}
