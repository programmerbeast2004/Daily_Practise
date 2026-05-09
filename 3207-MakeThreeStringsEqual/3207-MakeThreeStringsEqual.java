// Last updated: 5/9/2026, 11:24:41 AM
class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        final int min=Math.min(s1.length(),Math.min(s2.length(),s3.length()));
        int i=0;
        while(i<min && s1.charAt(i)==s2.charAt(i)&&s2.charAt(i)==s3.charAt(i)) ++i;
        return i==0 ? -1:s1.length()+s2.length()+s3.length()-i*3;
    }
}