// Last updated: 12/7/2025, 8:20:27 AM
1class Solution {
2    public int[] sortByReflection(int[] arr) {
3        int n=arr.length;
4        for(int i=0;i<n-1;i++){
5            for(int j=i+1;j<n;j++){
6                int r1=ref(arr[i]);
7                int r2=ref(arr[j]);
8                if(r1>r2 ||r1==r2 && arr[i]>arr[j]){
9                    int temp=arr[i];
10                    arr[i]=arr[j];
11                    arr[j]=temp;
12                }
13            }
14           
15        }
16        return arr;
17    }
18    public int ref(int n){
19        int rev=0;
20        while(n>0){
21            int bit=n%2;
22            rev=rev*2+bit;
23            n=n/2;
24        }
25        return rev;
26    }
27}