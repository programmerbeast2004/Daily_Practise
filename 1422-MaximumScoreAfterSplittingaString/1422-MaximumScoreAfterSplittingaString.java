// Last updated: 9/23/2026, 5:23:02 PM
1class Solution {
2    public int maxScore(String s) {
3        int to=0;
4        int no=0;
5        int nz=0;
6        int b=Integer.MIN_VALUE;
7
8        for(char ch:s.toCharArray()){
9            if(ch=='1')to++;
10        }
11        for(int i=0;i<s.length()-1;i++){
12            if(s.charAt(i)=='1')no++;
13            else nz++;
14            int curr=nz+(to-no);
15            b=Math.max(b,curr);
16        }
17        return b;
18    }
19}