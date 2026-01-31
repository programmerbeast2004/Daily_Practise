// Last updated: 1/31/2026, 8:12:46 PM
1class Solution {
2    public String reverseByType(String s) {
3        StringBuilder l=new StringBuilder();
4        StringBuilder sp=new StringBuilder();
5        for(char c:s.toCharArray()){
6            if(c>='a' &&c<='z') l.append(c);
7            else sp.append(c);
8        }
9        l.reverse();
10        sp.reverse();
11        StringBuilder res=new StringBuilder();
12        int i=0,j=0;
13        for(char c:s.toCharArray()){
14            res.append(c>='a' && c<='z' ? l.charAt(i++) : sp.charAt(j++));
15        }
16        return res.toString();
17    }
18}