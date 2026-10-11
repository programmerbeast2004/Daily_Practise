// Last updated: 10/11/2026, 1:28:56 PM
1class Solution {
2    public int countLargestGroup(int n) {
3        int[] count=new int[101];
4        for(int i=1;i<=n;i++){
5            int num=i;
6            int sum=0;
7
8            while(num>0){
9                sum+=num%10;
10                num/=10;
11            }
12            count[sum]++;
13        }
14        int max=0;
15        for(int freq:count){
16            max=Math.max(freq,max);
17        }
18
19        int ans=0;
20        for(int freq:count){
21            if(freq==max){
22                ans++;
23            }
24        }
25
26        return ans;
27    }
28}