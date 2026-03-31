// Last updated: 3/31/2026, 10:13:48 PM
1class Solution {
2    public int countHillValley(int[] nums) {
3        int n=nums.length;
4        List<Integer>arr=new ArrayList<>();
5        arr.add(nums[0]);
6        for(int i=1;i<n;i++){
7            if(nums[i]!=nums[i-1]){
8                arr.add(nums[i]);
9            }
10        }
11        int c=0;
12        for(int i=1;i<arr.size()-1;i++){
13            if(arr.get(i)>arr.get(i-1) && arr.get(i)>arr.get(i+1)){
14                c++; //hills
15            }
16            else if(arr.get(i)<arr.get(i-1)&& arr.get(i)<arr.get(i+1)){
17                c++; //valley
18            }
19        }
20        return c;
21    }
22}