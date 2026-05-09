// Last updated: 5/9/2026, 11:29:18 AM
class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        String bin=Integer.toBinaryString(n);
        StringBuilder sb=new StringBuilder();
        for(char c:bin.toCharArray()){
            if(c=='0') sb.append('1');
            else sb.append('0');
        }
        return Integer.parseInt(sb.toString(),2);
    }
}