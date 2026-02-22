// Last updated: 2/22/2026, 8:31:55 AM
1class Solution {
2    public boolean isDigitorialPermutation(int n) {
3        int o=n;
4        int s=0;
5        while(n>0){
6            int dt=n%10;
7            s+=f(dt);
8            n/=10;
9        }
10        return same(s,o);
11    }
12    public boolean same(int a,int b){
13        char[] x=String.valueOf(a).toCharArray();
14        char[]y=String.valueOf(b).toCharArray();
15        if(x.length!=y.length) return false;
16        java.util.Arrays.sort(x);
17        java.util.Arrays.sort(y);
18        return java.util.Arrays.equals(x,y);
19    }
20    public int f(int n){
21        int fa=1;
22        for(int i=1;i<=n;i++){
23            fa*=i;
24        }
25        return fa;
26        
27    }
28}