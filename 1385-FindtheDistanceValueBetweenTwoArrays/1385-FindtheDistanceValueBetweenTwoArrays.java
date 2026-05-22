// Last updated: 5/22/2026, 7:39:51 AM
1class Solution {
2    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
3        int c=0;
4        for(int a:arr1){
5            boolean valid=true;
6            for(int b:arr2){
7                if(Math.abs(a-b)<=d){
8                    valid=false;
9                    break;
10                }
11            }
12            if(valid)c++;
13        }
14        return c;
15    }
16}