// Last updated: 1/2/2026, 6:47:40 AM
1class Solution {
2    public int[] sortArrayByParityII(int[] nums) {
3        int i=0, j=1, n=nums.length;
4        int[] temp=new int[n];
5        for(int x:nums){
6        if(x%2==0){
7            temp[i]=x;
8            i+=2;
9        }
10        else{
11            temp[j]=x;
12            j+=2;
13        }
14        }
15        return temp;
16    }
17}