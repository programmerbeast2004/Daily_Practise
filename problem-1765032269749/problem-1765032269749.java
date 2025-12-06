// Last updated: 12/6/2025, 8:14:29 PM
1class Solution {
2    public boolean completePrime(int num) {
3        String s=String.valueOf(num);
4        for(int i=1;i<s.length();i++){
5            int pre=Integer.parseInt(s.substring(0,i));
6            int suf=Integer.parseInt(s.substring(i));
7            if(!isPrime(pre) || !isPrime(suf)) return false;
8        }
9        return isPrime(num);
10    }
11    public boolean isPrime(int n){
12        if(n<2) return false;
13        for(int i=2;i*i<=n;i++){
14            if(n%i==0) return false;
15        
16        }
17        return true;
18    }
19}