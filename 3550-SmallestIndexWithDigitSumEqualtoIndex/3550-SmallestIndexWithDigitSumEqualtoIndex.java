// Last updated: 9/24/2026, 11:45:44 PM
1class Solution {
2    public int smallestIndex(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            int n=nums[i];
5            int s=0;
6            while(n>0){
7                s+=n%10;
8                n/=10;
9            }
10            if(s==i){
11                return i;
12            }
13
14        }
15        return -1;
16    }
17}