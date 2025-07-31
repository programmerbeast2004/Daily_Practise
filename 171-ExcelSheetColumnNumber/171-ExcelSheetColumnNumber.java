// Last updated: 7/31/2025, 12:21:00 PM
class Solution {
    public int titleToNumber(String columnTitle) {
        int result=0;
        for(char c:columnTitle.toCharArray()){
            result=result*26+(c-'A'+1);
        }
        return result;
    }
}