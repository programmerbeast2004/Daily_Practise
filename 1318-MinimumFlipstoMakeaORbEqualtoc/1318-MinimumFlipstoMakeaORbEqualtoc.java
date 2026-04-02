// Last updated: 4/2/2026, 8:27:04 AM
1class Solution {
2    public int minFlips(int a, int b, int c) {
3        int count=0;
4        while(a!=0 || b!=0 || c!=0){
5            int ab=a&1;
6            int bb=b&1;
7            int cb=c&1;
8            if(cb==0){
9                if(ab==1)count++;
10                if(bb==1)count++;
11            }
12            else{
13                if(ab==0 && bb==0)count++;
14            }
15            a>>=1;
16            b>>=1;
17            c>>=1;
18        }
19        return count;
20    }
21}