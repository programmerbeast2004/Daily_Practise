// Last updated: 12/7/2025, 8:48:57 AM
1class Solution {
2    public int largestPrime(int n) {
3        if(n<2) return 0;
4        boolean[] p=new boolean[n+1];
5        for(int i=2;i<=n;i++) p[i]=true;
6        for(int i=2;i*i<=n;i++){
7            if(p[i]){
8                for(int j=i*i;j<=n;j+=i){
9                    p[j]=false;
10                }
11            }
12        }
13        int s=0,ans=0;
14        for(int i=2;i<=n;i++){
15            if(p[i]){
16                s+=i;
17                if(s>n) break;
18                if(p[s]) ans=s;
19            }
20        }
21        return ans;
22    }
23}