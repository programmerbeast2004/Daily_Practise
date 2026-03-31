// Last updated: 3/31/2026, 6:26:39 AM
1class Solution {
2    public int[][] imageSmoother(int[][] arr) {
3        int m=arr.length;
4        int n=arr[0].length;
5        for(int i=0;i<m;i++){
6            for(int j=0;j<n;j++){
7                int s=0,c=0;
8                for(int x=i-1;x<=i+1;x++){
9                    for(int y=j-1;y<=j+1;y++){
10                        if(x>=0 && x<m && y>=0 && y<n){
11                            s+=arr[x][y]%256;
12                            c++;
13                        }
14                    }
15                }
16                int avg=s/c;
17                arr[i][j]+=avg*256;
18            }
19        }
20        for(int i=0;i<m;i++){
21            for(int j=0;j<n;j++){
22                arr[i][j]/=256;
23            }
24        }
25        return arr;
26        
27    }
28}