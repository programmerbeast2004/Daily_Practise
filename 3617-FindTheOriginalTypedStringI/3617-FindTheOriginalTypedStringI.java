// Last updated: 7/31/2025, 12:16:49 PM
class Solution {
    public int possibleStringCount(String word) {
        int n=word.length();
        int count=n;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)!=word.charAt(i-1)) {
                count--;
            }
        }
        return count;
    }
}