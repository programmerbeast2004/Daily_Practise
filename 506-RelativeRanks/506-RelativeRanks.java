// Last updated: 3/26/2026, 5:20:22 PM
1class Solution {
2    public String[] findRelativeRanks(int[] score) {
3        int n=score.length;
4        int[][] arr=new int[n][2];
5        for(int i=0;i<n;i++){
6            arr[i][0]=score[i];
7            arr[i][1]=i;
8        }
9        Arrays.sort(arr,(a,b)->b[0]-a[0]);
10        String[]res=new String[n];
11        for(int i=0;i<n;i++){
12            if(i==0)res[arr[i][1]]="Gold Medal";
13            else if(i==1)res[arr[i][1]]="Silver Medal";
14            else if(i==2)res[arr[i][1]]="Bronze Medal";
15            else res[arr[i][1]]=String.valueOf(i+1);
16        }
17        return res;
18    }
19}