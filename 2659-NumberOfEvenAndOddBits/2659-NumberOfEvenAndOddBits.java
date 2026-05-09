// Last updated: 5/9/2026, 11:25:33 AM
class Solution {
    public int[] evenOddBit(int n) {
        String s=Integer.toBinaryString(n);
        int e=0,o=0;
        int idx=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                if(idx%2==0){
                    e++;
                }
                else{
                    o++;
                }
            }
            idx++;
        }
        return new int[]{e,o};
    }
}