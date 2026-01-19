// Last updated: 1/19/2026, 12:10:31 PM
1class Solution {
2    public int sumSubarrayMins(int[] arr) {
3        int n=arr.length;
4        int[] l=new int[n];
5        int[] r=new int[n];
6        //left
7        Stack<int[]> st1=new Stack<>();
8        for(int i=0;i<n;i++){
9            int c=1;
10            while(!st1.isEmpty()&& st1.peek()[0]>arr[i]){
11                c+=st1.pop()[1];
12            }
13            st1.push(new int[] {arr[i],c});
14            l[i]=c;
15        }
16
17        //right
18        Stack<int[]> st2=new Stack<>();
19        for(int i=n-1;i>=0;i--){
20            int c=1;
21            while(!st2.isEmpty() && st2.peek()[0]>=arr[i]){
22                c+=st2.pop()[1];
23            }
24            st2.push(new int[] {arr[i],c});
25            r[i]=c;
26        }
27        long ans=0;
28        int MOD=1000000007;
29        for(int i=0;i<n;i++){
30            ans = (ans + (long) arr[i] * l[i] * r[i]) % MOD;
31        }
32        return (int)ans;
33
34
35    }
36}