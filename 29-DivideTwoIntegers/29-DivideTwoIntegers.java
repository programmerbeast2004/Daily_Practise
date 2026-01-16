// Last updated: 1/16/2026, 8:49:06 AM
1class Solution {
2    public int divide(int dvd, int dvr) {
3        //1 
4        if(dvd==Integer.MIN_VALUE && dvr==-1){
5            return Integer.MAX_VALUE;
6        }
7        //2
8        long a=Math.abs((long)dvd);
9        long b=Math.abs((long)dvr);
10
11        //3
12        int res=0;
13        while(a>=b){
14            long temp=b;
15            int ct=1;
16            while(a>=(temp<<1)){
17                temp<<=1;
18                ct<<=1;
19            }
20            a-=temp;
21            res+=ct;
22
23        }
24        //4
25        if((dvd<0) ^ (dvr<0) )res=-res;
26        return res;
27    }
28}