// Last updated: 1/5/2026, 3:09:21 PM
1class Solution {
2    public int minimumBuckets(String hamsters) {
3        char[] arr=hamsters.toCharArray();
4        int n=arr.length;
5        boolean[] fed=new boolean[n];
6        int b=0;
7        for(int i=0;i<n;i++){
8            if(arr[i]=='H' && !fed[i]){
9                if(i+1<n && arr[i+1]=='.'){
10                    fed[i]=true;
11                    b++;
12                    if(i+2<n && arr[i+2]=='H'){
13                        fed[i+2]=true;
14                    }
15                }
16                else if(i-1>=0 && arr[i-1]=='.'){
17                    fed[i]=true;
18                    b++;
19                    if(i-2>=0 && arr[i-2]=='H'){
20                        fed[i-2]=true;
21                    }
22                }
23                else{
24                    return -1;
25                }
26            }
27        }
28        return b;
29    }
30}