// Last updated: 7/31/2025, 12:20:54 PM
class Solution {
    public int hammingWeight(int n) {
        int c=0;
        String str=Integer.toBinaryString(n);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1') c++;
        }
        return c;
    }
}