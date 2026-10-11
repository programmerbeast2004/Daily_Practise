// Last updated: 10/11/2026, 1:50:34 PM
1class Solution {
2    public int countSymmetricIntegers(int low, int high) {
3        int c=0;
4        for(int num=low;num<=high;num++){
5            String s=Integer.toString(num);
6            int len=s.length();
7            if(len%2!=0)continue;
8            int mid=len/2;
9            int ls=0,rs=0;
10
11            for(int i=0;i<mid;i++){
12                ls+=s.charAt(i)-'0';
13                rs+=s.charAt(i+mid)-'0';
14            }
15            if(ls==rs){
16                c++;
17            }
18        }
19        return c;
20    }
21}