// Last updated: 4/6/2026, 7:15:56 AM
1class Solution {
2    public int[] sortByBits(int[] arr) {
3        int n=arr.length;
4        Integer[]num=new Integer[n];
5        for(int i=0;i<n;i++){
6            num[i]=arr[i];
7        }
8        Arrays.sort(num,(a,b)->{
9            int ca=Integer.bitCount(a);
10            int cb=Integer.bitCount(b);
11            if(ca==cb){
12                return a-b;
13            }
14            return ca-cb;
15        });
16        for(int i=0;i<n;i++){
17            arr[i]=num[i];
18        }
19        return arr;
20    }
21}