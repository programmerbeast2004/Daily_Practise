// Last updated: 3/11/2026, 10:46:57 AM
1class Solution {
2    public int bitwiseComplement(int n) {
3        if(n==0) return 1;
4        String bin=Integer.toBinaryString(n);
5        StringBuilder sb=new StringBuilder();
6        for(char c:bin.toCharArray()){
7            if(c=='0') sb.append('1');
8            else sb.append('0');
9        }
10        return Integer.parseInt(sb.toString(),2);
11    }
12}