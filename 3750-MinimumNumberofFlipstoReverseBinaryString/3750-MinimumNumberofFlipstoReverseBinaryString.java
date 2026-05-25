// Last updated: 5/25/2026, 4:19:45 PM
1class Solution {
2    public int minimumFlips(int n) {
3        String s=Integer.toBinaryString(n);
4        String r=new StringBuilder(s).reverse().toString();
5        int f=0;
6        for(int i=0;i<s.length();i++){
7        if(s.charAt(i)!=r.charAt(i)){
8            f++;
9        }
10        }
11        return f;
12    }
13}